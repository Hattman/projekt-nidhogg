package org.megabear;

public class Hero implements solid{
	private int m_x = 0;
	private int m_y = 0;
	private int m_speed = 1;
	
	
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
	public String path() {
		// TODO Auto-generated method stub
		return null;
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
