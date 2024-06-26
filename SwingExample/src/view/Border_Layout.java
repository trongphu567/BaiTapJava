package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Border_Layout extends JFrame{
	public Border_Layout() {
		this.setTitle("Grid_Layout");
		this.setSize(600,400);
		//can giua cua so chuong trinh
		this.setLocationRelativeTo(null);
		
		//set layout
		BorderLayout borderLayout=new BorderLayout();
		BorderLayout borderLayout_1=new BorderLayout(4,4);
		this.setLayout(borderLayout);
		
		//tao button
		JButton j1=new JButton("1");
		JButton j2=new JButton("2");
		JButton j3=new JButton("3");
		//add thanh phan
		this.add(j1,BorderLayout.EAST);
		this.add(j2,BorderLayout.NORTH);
		this.add(j3,BorderLayout.WEST);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Border_Layout bl=new Border_Layout();
		
	}
}
