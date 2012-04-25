package org.megabear;

import java.awt.Rectangle;

import org.megabear.Main.dir;

public class Hero implements solid{
	private int m_speed;
	private dir lastDir;
	private boolean m_goUp;
	private boolean m_goDown;
	private boolean m_goLeft;
	private boolean m_goRight;
	private String m_path = "sprite\\Hero.png";
	private Rectangle m_area;
	
	public Hero() {
		m_speed = 5;
		m_goUp = true;
		m_goDown = true;
		m_goLeft = true;
		m_goRight = true;
		m_area = new Rectangle(400,400,32,32);
	}
	
	@Override
	public int getX() {
		return (int) m_area.getX();
	}

	@Override
	public int getY() {
		return (int) m_area.getY();
	}
	
	@Override
	public void move(dir p_d) {
		switch(p_d){
		case UP:
			if(m_goUp){
				m_area.setLocation(getX(), getY()-m_speed);
				m_goDown = true;
				m_goRight = true;
				m_goLeft = true;
			}
			break;
		case LEFT:
			if(m_goLeft){
				m_area.setLocation(getX()-m_speed, getY());
				m_goDown = true;
				m_goRight = true;
				m_goUp = true;
			}
			break;
		case DOWN:
			if(m_goDown){
				m_area.setLocation(getX(), getY()+m_speed);
				m_goRight = true;
				m_goUp = true;
				m_goLeft = true;
			}
			break;
		case RIGHT:
			if(m_goRight){
				m_area.setLocation(getX()+m_speed, getY());
				m_goDown = true;
				m_goUp = true;
				m_goLeft = true;
			}
			break;
		}
		lastDir = p_d;
		
	}

	@Override
	public String getPath() {
		return m_path;
	}

	@Override
	public boolean blockAt(Rectangle p_area) {
		if(m_area.intersects(p_area)){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void colliedAction(solid p_s) {
		// TODO Auto-generated method stub
		if(p_s.typ().equals("Block")){
			m_speed = 2;
			if(lastDir == dir.UP){
				move(dir.DOWN);
				m_goUp = false;
			}else if(lastDir == dir.DOWN){
				move(dir.UP);
				m_goDown = false;
			}else if(lastDir == dir.RIGHT){
				move(dir.LEFT);
				m_goRight = false;
			}else if(lastDir == dir.LEFT){
				move(dir.RIGHT);
				m_goLeft = false;
			}
			m_speed = 5;
		}
		
	}

	@Override
	public String typ() {
		return "Hero";
	}

	@Override
	public Rectangle getArea() {
		return m_area;
	}

}
