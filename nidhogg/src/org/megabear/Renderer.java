package org.megabear;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JFrame{
	private static final long serialVersionUID = 1L;
	Nidhogg m_game;
	
	public Renderer(Nidhogg p_game){
		m_game = p_game;
		this.setSize(800,600);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void draw(float p_interpolation){
		//do magic
		Graphics g = getGraphics();
		g.setColor(Color.GREEN);
		g.fillRect(0, 560, 800, 40);
	}
}