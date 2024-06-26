package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("My Calculator");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jTextField=new JTextField();
		JPanel jPanel_head=new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField,BorderLayout.CENTER);
		
		JButton jb0=new JButton("0");
		JButton jb1=new JButton("1");
		JButton jb2=new JButton("2");
		JButton jb3=new JButton("3");
		JButton jb4=new JButton("4");
		JButton jb5=new JButton("5");
		JButton jb6=new JButton("6");
		JButton jb7=new JButton("7");
		JButton jb8=new JButton("8");
		JButton jb9=new JButton("9");
		JButton jb_cong=new JButton("+");
		JButton jb_tru=new JButton("-");
		JButton jb_nhan=new JButton("*");
		JButton jb_chia=new JButton("/");
		JButton jb_bang=new JButton("=");
		JPanel jPanel_cont=new JPanel();
		jPanel_cont.setLayout(new GridLayout(5,3));
		
		jPanel_cont.add(jb0);
		jPanel_cont.add(jb1);
		jPanel_cont.add(jb2);
		jPanel_cont.add(jb3);
		jPanel_cont.add(jb4);
		jPanel_cont.add(jb5);
		jPanel_cont.add(jb6);
		jPanel_cont.add(jb7);
		jPanel_cont.add(jb8);
		jPanel_cont.add(jb9);
		jPanel_cont.add(jb_cong);
		jPanel_cont.add(jb_tru);
		jPanel_cont.add(jb_nhan);
		jPanel_cont.add(jb_chia);
		jPanel_cont.add(jb_bang);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_head,BorderLayout.NORTH);
		this.add(jPanel_cont,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyCalculator mc=new MyCalculator();
	}
}
