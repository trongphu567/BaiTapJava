package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow_Layout extends JFrame {
	public Flow_Layout() {
		this.setTitle("Flow_Layout");
		this.setSize(600,400);
		//can giua cua so chuong trinh
		this.setLocationRelativeTo(null);
		
		//set layout
		FlowLayout flowLayout=new FlowLayout();
		FlowLayout flowLayout_1=new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowLayout_2=new FlowLayout(FlowLayout.CENTER,10,50);
		this.setLayout(flowLayout_2);
		
		JButton jButton_1=new JButton("1");
		JButton jButton_2=new JButton("2");
		JButton jButton_3=new JButton("3");
		//add thanh phan
		this.add(jButton_1);
		this.add(jButton_2);
		this.add(jButton_3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Flow_Layout fl=new Flow_Layout();
		
	}
}
