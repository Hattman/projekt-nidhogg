package org.megabear;

public class Main {
	
	public static final int TICKS_PER_SECOND = 25;
	public static final int SKIP_TICKS = 1000 / TICKS_PER_SECOND;
	public static final int MAX_FRAMESKIP = 5;
	
	public static long next_game_tick;
	public static int loops;
	public static float interpolation;
	
	public static boolean game_is_running = true;
	
	public static void main(String[] args) {
		Nidhogg game = new Nidhogg();
		Renderer rend = new Renderer(game);
		
		next_game_tick = System.currentTimeMillis();
		
		while(game_is_running){
			loops = 0;
			//tick
			while(System.currentTimeMillis() > next_game_tick && loops < MAX_FRAMESKIP){
				game.tick();
				next_game_tick += SKIP_TICKS;
				loops++;
			}
			//render
			interpolation = System.currentTimeMillis() + SKIP_TICKS - next_game_tick / SKIP_TICKS;
			rend.draw(interpolation);
		}
		
	}
}
