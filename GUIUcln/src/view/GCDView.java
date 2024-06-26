package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.GCDController;
import model.GCDModel;

public class GCDView extends JFrame{
	private GCDModel model;
	private JTextField jTextField_soA;
	private JTextField jTextField_soB;
	private JTextField jTextField_gcd;
	private JTextField jTextField_lcm;

	public GCDView() {
		this.model = new GCDModel();
		this.init();
	}
	public void init() {
		this.setTitle("Calculator GCD-LCM");
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		Font font_label=new Font("Times New Roman",Font.PLAIN,16);
		
		JLabel jLabel_header=new JLabel("Ước số chung - Bội số chung",JLabel.CENTER);
		jLabel_header.setFont(new Font("Times New Roman",Font.BOLD,20));
		jLabel_header.setForeground(Color.RED);
		
		JPanel jPanel_content=new JPanel();
		jPanel_content.setLayout(new GridLayout(4,1));
		
		JLabel jLabel_soA=new JLabel("Nhập số a:");
		jLabel_soA.setFont(font_label);
		jTextField_soA=new JTextField(10);
		jTextField_soA.setFont(font_label);
		
		JLabel jLabel_soB=new JLabel("Nhập số b:");
		jLabel_soB.setFont(font_label);
		jTextField_soB=new JTextField(10);
		jTextField_soB.setFont(font_label);
		
		JLabel jLabel_gcd=new JLabel("Ước số chung lớn nhất:");
		jLabel_gcd.setFont(font_label);
		jTextField_gcd=new JTextField(10);
		jTextField_gcd.setFont(font_label);
		jTextField_gcd.setEditable(false);
		
		JLabel jLabel_lcm=new JLabel("Bội số chung nhỏ nhất:");
		jLabel_lcm.setFont(font_label);
		jTextField_lcm=new JTextField(10);
		jTextField_lcm.setFont(font_label);
		jTextField_lcm.setEditable(false);
		
		ActionListener actionListener=new GCDController(this);
		
		JPanel jPanel_footer=new JPanel();
		JButton jButton_work=new JButton("Thực Hiện");
		jButton_work.addActionListener(actionListener);
		jButton_work.setFont(font_label);
		
		JButton jButton_continue=new JButton("Tiếp Tục");
		jButton_continue.addActionListener(actionListener);
		jButton_continue.setFont(font_label);
		
		JButton jButton_exit=new JButton("Thoát");
		jButton_exit.setFont(font_label);
		jButton_exit.addActionListener(actionListener);
		
		this.add(jLabel_header,BorderLayout.NORTH);
		
		jPanel_content.add(jLabel_soA);
		jPanel_content.add(jTextField_soA);
		jPanel_content.add(jLabel_soB);
		jPanel_content.add(jTextField_soB);
		jPanel_content.add(jLabel_gcd);
		jPanel_content.add(jTextField_gcd);
		jPanel_content.add(jLabel_lcm);
		jPanel_content.add(jTextField_lcm);
		this.add(jPanel_content,BorderLayout.CENTER);
		
		jPanel_footer.add(jButton_work);
		jPanel_footer.add(jButton_continue);
		jPanel_footer.add(jButton_exit);
		this.add(jPanel_footer,BorderLayout.SOUTH);
		this.setVisible(true);
		
		
		
	}
	public void getCalculate() {
		if (this.jTextField_soA.getText().isEmpty() || this.jTextField_soB.getText().isEmpty())
			JOptionPane.showMessageDialog(this, "Dữ liệu đang trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
		else {
			int soA=Integer.valueOf(this.jTextField_soA.getText());
			int soB=Integer.valueOf(this.jTextField_soB.getText());
			this.model.setA(soA);
			this.model.setB(soB);
			this.jTextField_gcd.setText(this.model.GCD(soA, soB)+"");
			this.jTextField_lcm.setText(this.model.LCM(soA, soB)+"");
		}
	}
	public void reset() {
		this.jTextField_soA.setText("");
		this.jTextField_soA.requestFocus();
		this.jTextField_soB.setText("");
		this.jTextField_gcd.setText("");
		this.jTextField_lcm.setText("");
	}
	
	
	
}
