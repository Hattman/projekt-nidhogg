package org.megabear;

import org.megabear.Main.dir;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;

public class Renderer extends JFrame implements KeyListener{
	private static final long serialVersionUID = 1L;
	private Vector<Entity> m_entityVector;
	private Nidhogg m_game;
	
	public Renderer(Nidhogg p_game){
		addKeyListener(this);
		m_game = p_game;
		m_entityVector = new Vector<Entity>();
		this.setSize(800,600);
		this.setVisible(true);
		this.setResizable(false);
		this.createBufferStrategy(2);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void draw(float p_interpolation){
		BufferStrategy bf = this.getBufferStrategy();
		//do magic
		Graphics g = null;
		try {
			g = bf.getDrawGraphics();
			g.clearRect(0, 0, 800, 600);
		
			m_entityVector = m_game.getObjects();
			for(int i=0; i<m_entityVector.size(); i++){
				ImageIcon image = new ImageIcon(m_entityVector.get(i).getPath());
				image.paintIcon(this, g, m_entityVector.get(i).getX(), m_entityVector.get(i).getY());
			}
		} 
		finally {
			g.dispose();
		}
		bf.show();
		Toolkit.getDefaultToolkit().sync();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			m_game.getDirection(dir.UP);
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			m_game.getDirection(dir.DOWN);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			m_game.getDirection(dir.RIGHT);
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			m_game.getDirection(dir.LEFT);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		m_game.getDirection(dir.NONE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}