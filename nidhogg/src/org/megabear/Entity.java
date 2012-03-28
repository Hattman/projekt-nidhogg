package org.megabear;

public abstract class Entity {
	protected int health = 100;
	protected int damage = 0;
	
	public abstract void begin_tick();
	public abstract void commit_tick();
	public abstract void rollback_tick();
	public abstract boolean isSolid();
	public abstract boolean collides(Entity p_ent);
	public abstract boolean blockAt(int x, int y);
	
	public int getDamage(){
		return damage;
	}
	
	public void attackEntityFrom(Entity p_entity){
		health -= p_entity.getDamage();
	}
	
	public boolean isDead(){
		if(health<0)
			return true;
		return false;
	}
}
