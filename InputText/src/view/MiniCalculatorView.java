package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame{
	private MiniCalculatorModel miniCalculatorModel;
	private JTextField jTextField_first_value;
	private JTextField jTextField_second_value;
	private JTextField jTextField_answer;
	
	
	public MiniCalculatorView(){
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
	}
	public void init() {
		this.setTitle("Mini Calculator");
		this.setSize(600,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font=new Font("Arial",Font.BOLD,32);
		JLabel JLabel_first_value=new JLabel("1st Value");
		JLabel_first_value.setFont(font);
		JLabel JLabel_second_value=new JLabel("2nd Value");
		JLabel_second_value.setFont(font);
		JLabel jLabel_answer=new JLabel("Answer");
		jLabel_answer.setFont(font);
		
		jTextField_first_value=new JTextField(50);
		jTextField_first_value.setFont(font);
		jTextField_second_value=new JTextField(50);
		jTextField_second_value.setFont(font);
		jTextField_answer=new JTextField(50);
		jTextField_answer.setFont(font);
		
		JPanel jPanelIO=new JPanel();
		jPanelIO.setLayout(new GridLayout(3,2,10,10));
		jPanelIO.add(JLabel_first_value);
		jPanelIO.add(jTextField_first_value);
		jPanelIO.add(JLabel_second_value);
		jPanelIO.add(jTextField_second_value);
		jPanelIO.add(jLabel_answer);
		jPanelIO.add(jTextField_answer);
		
		MiniCalculatorListener miniCalculatorListener=new MiniCalculatorListener(this);
		
		JButton jButton_add=new JButton("+");
		jButton_add.setFont(font);
		jButton_add.addActionListener(miniCalculatorListener);
		
		JButton jButton_sub=new JButton("-");
		jButton_sub.setFont(font);
		jButton_sub.addActionListener(miniCalculatorListener);
		
		JButton jButton_mul=new JButton("*");
		jButton_mul.setFont(font);
		jButton_mul.addActionListener(miniCalculatorListener);
		
		JButton jButton_div=new JButton("/");
		jButton_div.setFont(font);
		jButton_div.addActionListener(miniCalculatorListener);
		
		JButton jButton_pow=new JButton("^");
		jButton_pow.setFont(font);
		jButton_pow.addActionListener(miniCalculatorListener);
		
		JButton jButton_mod=new JButton("%");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(miniCalculatorListener);
		
		JPanel jPanelButtons=new JPanel();
		jPanelButtons.setLayout(new GridLayout(2,3,10,10));
		jPanelButtons.add(jButton_add);
		jPanelButtons.add(jButton_sub);
		jPanelButtons.add(jButton_mul);
		jPanelButtons.add(jButton_div);
		jPanelButtons.add(jButton_pow);
		jPanelButtons.add(jButton_mod);
		
		this.setLayout(new BorderLayout(10,10));
		this.add(jPanelIO,BorderLayout.CENTER);
		this.add(jPanelButtons,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public void add() {
		double firstValue=Double.valueOf(jTextField_first_value.getText());
		double secondValue=Double.valueOf(jTextField_second_value.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.add();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void sub() {
		double firstValue=Double.valueOf(jTextField_first_value.getText());
		double secondValue=Double.valueOf(jTextField_second_value.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.sub();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void mul() {
		double firstValue=Double.valueOf(jTextField_first_value.getText());
		double secondValue=Double.valueOf(jTextField_second_value.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.mul();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void divide() {
		double firstValue=Double.valueOf(jTextField_first_value.getText());
		double secondValue=Double.valueOf(jTextField_second_value.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.divide();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void power() {
		double firstValue=Double.valueOf(jTextField_first_value.getText());
		double secondValue=Double.valueOf(jTextField_second_value.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.power();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void mod() {
		double firstValue=Double.valueOf(jTextField_first_value.getText());
		double secondValue=Double.valueOf(jTextField_second_value.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.mod();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	
	
	
}
