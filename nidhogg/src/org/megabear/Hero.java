package org.megabear;

import org.megabear.Main.dir;

public class Hero implements solid{
	private int m_x;
	private int m_y;
	private int m_speed;
	private String m_path = "sprite\\Hero.png";
	
	public Hero() {
		m_x = 400;
		m_y = 400;
		m_speed = 5;
	}
	
	@Override
	public int getX() {
		return m_x;
	}

	@Override
	public int getY() {
		return m_y;
	}
	
	@Override
	public void move(dir p_d) {
		switch(p_d){
		case UP:
			m_y -= m_speed;
			break;
		case LEFT:
			m_x -= m_speed;
			break;
		case DOWN:
			m_y += m_speed;
			break;
		case RIGHT:
			m_x += m_speed;
			break;
		}
		
	}

	@Override
	public String getPath() {
		return m_path;
	}

	@Override
	public boolean blockAt(int p_x, int p_y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void colliedAction(Entity p_e) {
		// TODO Auto-generated method stub
		
	}

}
