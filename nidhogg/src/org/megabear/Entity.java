package org.megabear;

import java.awt.Rectangle;

import org.megabear.Main.dir;

public interface Entity {
	public int getX();
	public int getY();
	public Rectangle getArea();
	public void move(dir p_d);
	public String getPath();
	public String typ();
}
