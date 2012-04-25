package org.megabear;

import java.awt.Rectangle;

public interface solid extends Entity {
	public boolean blockAt(Rectangle p_area);
	public void colliedAction(solid p_s);
}
