package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton upButton;
	private JButton downButton;
	private JLabel jLabel;
	private JButton resetButton;
	
	public CounterView() {
		this.counterModel=new CounterModel();
		this.init();	
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("Program Counter");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac=new CounterListener(this);
		
		upButton=new JButton("UP");
		upButton.addActionListener(ac);
		
		downButton=new JButton("DOWN");
		downButton.addActionListener(ac);
		
		resetButton=new JButton("RESET");
		resetButton.addActionListener(ac);
		
		jLabel=new JLabel(this.counterModel.getValue()+"",JLabel.CENTER);
		JPanel jp=new JPanel();
		jp.setLayout(new BorderLayout());
		jp.add(upButton,BorderLayout.WEST);
		jp.add(downButton,BorderLayout.EAST);
		jp.add(jLabel,BorderLayout.CENTER);
		jp.add(resetButton,BorderLayout.SOUTH);

		this.setLayout(new BorderLayout());
		this.add(jp,BorderLayout.CENTER);
		
	}
	public void increment() {
		this.counterModel.increment();
		this.jLabel.setText(this.counterModel.getValue()+"");
		
	}
	public void decrement() {
		this.counterModel.decrement();
		this.jLabel.setText(this.counterModel.getValue()+"");
	}
	public void reset() {
		this.counterModel.reset();
		this.jLabel.setText(this.counterModel.getValue()+"");
	}
	
	
		
}
