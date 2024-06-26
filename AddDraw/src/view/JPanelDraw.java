package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(15, 15, 150, 150);
		
		g.setColor(Color.BLUE);
		g.drawOval(100, 100, 200, 200);
		
		
		g.setColor(Color.BLACK);
		g.fill3DRect(200, 200, 200, 100, getFocusTraversalKeysEnabled());
		
		g.setColor(Color.GRAY);
		g.drawString("Hello", 500, 500);
	}
	
}
