package org.megabear;

public interface solid extends Entity {
	public boolean blockAt(int p_x, int p_y);
	public void colliedAction(Entity p_e);
}
