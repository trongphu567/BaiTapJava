package view;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;


public class LastButtonView extends JFrame{
	private LastButtonModel lastButtonModel;
	private JLabel jLabel;

	public LastButtonView() {
		this.lastButtonModel=new LastButtonModel();
		this.init();
	}
	public void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(300,300);
		
		JPanel jpanel_Center=new JPanel();
		jpanel_Center.setLayout(new GridLayout(2,2));
		
		LastButtonListener ac=new LastButtonListener(this);
		
		Font font=new Font("Arial", Font.BOLD, 32);
		
		JButton jButton1=new JButton("1");
		jButton1.setFont(font);
		jButton1.addActionListener(ac);
		JButton jButton2=new JButton("2");
		jButton2.setFont(font);
		jButton2.addActionListener(ac);
		JButton jButton3=new JButton("3");
		jButton3.setFont(font);
		jButton3.addActionListener(ac);
		JButton jButton4=new JButton("4");
		jButton4.setFont(font);
		jButton4.addActionListener(ac);
		
		jpanel_Center.add(jButton1);
		jpanel_Center.add(jButton2);
		jpanel_Center.add(jButton3);
		jpanel_Center.add(jButton4);
		
		JPanel jPanel_Footer=new JPanel();
		jLabel=new JLabel("------");
		jLabel.setFont(font);
		jPanel_Footer.add(jLabel);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_Center,BorderLayout.CENTER);
		this.add(jPanel_Footer,BorderLayout.SOUTH);
		this.setVisible(true);
		
	}
	public void changeTo_1() {
		this.lastButtonModel.setValue_1();
		jLabel.setText("Last Button:"+this.lastButtonModel.getValue());
	}
	public void changeTo_2() {
		this.lastButtonModel.setValue_2();
		jLabel.setText("Last Button:"+this.lastButtonModel.getValue());
	}
	public void changeTo_3() {
		this.lastButtonModel.setValue_3();
		jLabel.setText("Last Button:"+this.lastButtonModel.getValue());
	}
	public void changeTo_4() {
		this.lastButtonModel.setValue_4();
		jLabel.setText("Last Button:"+this.lastButtonModel.getValue());
	}
}
