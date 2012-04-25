package org.megabear;

import org.megabear.Main.dir;

public class Block implements solid{
	private int m_x;
	private int m_y;
	private dir lastDir;
	private String m_path;
	
	
	Block(int p_x, int p_y){
		m_x = p_x;
		m_y = p_y;
		m_path = "sprite\\Block.png";
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
		// TODO Auto-generated method stub
	}

	@Override
	public String getPath() {
		return m_path;
	}

	@Override
	public boolean blockAt(int p_x, int p_y) {
		if((p_x >= m_x)&&(p_x <= m_x+32)&&(p_y >= m_y)&&(p_y <= m_y+32)){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void colliedAction(Entity p_e) {
		//i dont give a shit
	}
	@Override
	public String typ() {
		return "Block";
	}

}
