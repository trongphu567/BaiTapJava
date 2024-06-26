package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorListener implements ActionListener {
	private MyColorView myColorView;
	
	public MyColorListener(MyColorView myColorView) {
		this.myColorView = myColorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src=e.getActionCommand();
		if (src.equals("RED TEXT")) {
			this.myColorView.changeTextColor(Color.RED);
		}
		else if (src.equals("YELLOW TEXT")) {
			this.myColorView.changeTextColor(Color.YELLOW);
		}
		else if (src.equals("GREEN TEXT")) {
			this.myColorView.changeTextColor(Color.GREEN);
		}
		else if (src.equals("RED BACKGROUND")) {
			this.myColorView.changeBackgroundColor(Color.RED);
		}
		else if (src.equals("YELLOW BACKGROUND")) {
			this.myColorView.changeBackgroundColor(Color.YELLOW);
		}
		else if (src.equals("GREEN BACKGROUND")){
			this.myColorView.changeBackgroundColor(Color.GREEN);
		}
	}
	
}
