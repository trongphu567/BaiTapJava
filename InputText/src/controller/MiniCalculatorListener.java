package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCalculatorView;

public class MiniCalculatorListener implements ActionListener {
	private MiniCalculatorView miniCalculatorView;
	
	
	public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {
		this.miniCalculatorView = miniCalculatorView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String button=e.getActionCommand();
		if (button.equals("+")) {
			this.miniCalculatorView.add();
		}
		else if (button.equals("-")) {
			this.miniCalculatorView.sub();
		}
		else if (button.equals("*")) {
			this.miniCalculatorView.mul();
		}
		else if (button.equals("/")) {
			this.miniCalculatorView.divide();
		}
		else if (button.equals("^")) {
			this.miniCalculatorView.power();
		}
		else if (button.equals("%")) {
			this.miniCalculatorView.mod();
		}
	}
}
