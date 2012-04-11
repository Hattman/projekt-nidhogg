package org.megabear;

public interface Entity {
	public enum dir{UP,LEFT,DOWN,RIGHT};
	public int getX();
	public int getY();
	public void move(dir p_d);
	public String path();
}
