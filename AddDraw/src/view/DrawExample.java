package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawExample extends JFrame {
	public DrawExample() {
		this.setTitle("Draw Example");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanelDraw jPanelDraw=new JPanelDraw();
		this.setLayout(new BorderLayout());
		this.add(jPanelDraw,BorderLayout.CENTER);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		DrawExample drawExample=new DrawExample();
	}
}
