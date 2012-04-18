package org.megabear;

import org.megabear.Main.dir;

public interface Entity {
	public int getX();
	public int getY();
	public void move(dir p_d);
	public String getPath();
}
