package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener{
	private CounterView ctView;
	
	public CounterListener(CounterView ctView) {
		this.ctView=ctView;
	}
	
	//khi lam hanh dong gi do =>xu li nguon su kien trong actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("Ban da nhan nut!");
		//lay ten hanh dong bang getActionCommand
		String src=e.getActionCommand();
		System.out.println("Ban da nhan nut: "+src);
		if (src.equals("UP")) 
			this.ctView.increment();
		else if (src.equals("DOWN")) 
			this.ctView.decrement();
		else 
			this.ctView.reset();
	}
	
}
