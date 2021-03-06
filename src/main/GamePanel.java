package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private int width = 500;
	private int height = 600;
	private int rectX=100;
	private int rectY=150;

	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.black);
		
		g.setColor(new Color(255, 0, 255));
		g.drawLine(4, 5, 100, 150);
		
		
		
		g.fillRect(rectX, rectY, 100, 200);
		g.setColor(new Color(0, 0, 255));
		
		g.fillRect(400, 230, 50, 200);
	
	}
}
