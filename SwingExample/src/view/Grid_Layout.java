package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid_Layout extends JFrame {
	public Grid_Layout() {
		this.setTitle("Grid_Layout");
		this.setSize(600,400);
		//can giua cua so chuong trinh
		this.setLocationRelativeTo(null);
		
		//set layout
		GridLayout gridLayout=new GridLayout();
		GridLayout gridLayout_1=new GridLayout(4,4);
		GridLayout gridLayout_2=new GridLayout(4,4,25,25);
		this.setLayout(gridLayout);
		
		//add thanh phan
		for (int i=0;i<10;i++) {
			JButton jb=new JButton(i+"");
			this.add(jb);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Grid_Layout gl=new Grid_Layout();
		
	}
}
