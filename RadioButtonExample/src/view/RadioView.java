package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.RadioController;

public class RadioView extends JFrame {
	public JRadioButton jRadioButton_red;
	public JRadioButton jRadioButton_green;
	public JRadioButton jRadioButton_blue;
	public JLabel jLabel_header;

	public RadioView() {
		this.setTitle("Radio Button Example");
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		jLabel_header=new JLabel("VÍ DỤ VỀ RADIO BUTTON",JLabel.CENTER);
		jLabel_header.setFont(new Font("Arial",Font.BOLD,20));
		jLabel_header.setForeground(Color.BLUE);
		
		JPanel jPanel_content=new JPanel();
		jPanel_content.setLayout(new GridLayout(1,3));
		
		ActionListener ac=new RadioController(this);
		jRadioButton_red=new JRadioButton("Red");
		jRadioButton_red.addActionListener(ac);
		jRadioButton_green=new JRadioButton("Green");
		jRadioButton_green.addActionListener(ac);
		jRadioButton_blue=new JRadioButton("Blue");
		jRadioButton_blue.addActionListener(ac);
		
		ButtonGroup radiobtn_group=new ButtonGroup();
		radiobtn_group.add(jRadioButton_red);
		radiobtn_group.add(jRadioButton_green);
		radiobtn_group.add(jRadioButton_blue);
		
		jPanel_content.add(jRadioButton_red);
		jPanel_content.add(jRadioButton_green);
		jPanel_content.add(jRadioButton_blue);
		
		
		
		
		this.add(jLabel_header,BorderLayout.NORTH);
		this.add(jPanel_content,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
