package org.megabear;

import java.util.Vector;

import org.megabear.Main.dir;

public class Nidhogg {
	private Vector<Entity> m_entityVector = new Vector<Entity>();
	private Hero m_theHero;
	
	public Nidhogg(){
		m_theHero = new Hero();
		m_entityVector.add(m_theHero);
	}
	
	public void tick(){
		//it moves
	}
	
	public void heroMove(dir p_dir){
		m_theHero.move(p_dir);
	}
	
	public Vector<Entity> getObjects(){
		return m_entityVector;
	}
}
