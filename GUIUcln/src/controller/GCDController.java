package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.GCDView;

public class GCDController implements ActionListener {
	private GCDView gcdView;

	public GCDController(GCDView gcdView) {
		this.gcdView = gcdView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src=e.getActionCommand();
		if (src.equals("Thực Hiện")) {
			System.out.println("Da nhan nut");
			this.gcdView.getCalculate();
		}
		else if (src.equals("Tiếp Tục")) {
			this.gcdView.reset();
		}
		else if (src.equals("Thoát")) {
		
			int select=JOptionPane.showConfirmDialog(gcdView, "Bạn có muốn thoát không ?", "Thông báo", JOptionPane.YES_NO_OPTION);
			if (select==JOptionPane.YES_OPTION)
				System.exit(0);
			
		}
	}
	
	
	
}
