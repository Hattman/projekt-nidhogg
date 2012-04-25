package org.megabear;

import java.util.Vector;

import org.megabear.Main.dir;

public class Nidhogg {
	private Vector<Entity> m_entityVector = new Vector<Entity>();
	private Vector<solid> m_solidVector = new Vector<solid>();
	private Hero m_theHero;
	private Block m_theBlock;
	private dir m_direction = dir.NONE;
	
	public Nidhogg(){
		m_theHero = new Hero();
		m_theBlock = new Block(400, 300);
		m_entityVector.add(m_theHero);
		m_solidVector.add(m_theHero);
		m_entityVector.add(m_theBlock);
		m_solidVector.add(m_theBlock);
		for(int i=200; i<600; i+=32){
			Block aBlock = new Block(i, 550);
			m_entityVector.add(aBlock);
			m_solidVector.add(aBlock);
		}
	}
	
	public void tick(){
		for(int i=0; i<m_entityVector.size(); i++){
			m_entityVector.get(i).move(m_direction);
		}
		for(int i=0; i<m_solidVector.size(); i++){
			for(int j=0; j<m_solidVector.size(); j++){
				boolean stuff = m_solidVector.get(i).blockAt(m_solidVector.get(j).getArea());
				if(stuff){
					m_solidVector.get(i).colliedAction(m_solidVector.get(j));
				}
			}
		}
	}
	
	public void getDirection(dir p_dir){
		m_direction = p_dir;
	}
	
	public Vector<Entity> getObjects(){
		return m_entityVector;
	}
}
