package org.megabear;

import java.awt.Rectangle;

import org.megabear.Main.dir;

public class Block implements solid{
	private Rectangle m_area;
	private String m_path;
	
	
	Block(int p_x, int p_y){
		m_area = new Rectangle(p_x,p_y,32,32);
		m_path = "sprite\\Block.png";
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
		// TODO Auto-generated method stub
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
		//???
	}
	@Override
	public String typ() {
		return "Block";
	}
	@Override
	public Rectangle getArea() {
		return m_area;
	}

}
