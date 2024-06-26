package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.GiaiPTView;

public class GiaiPTController implements ActionListener{
	private GiaiPTView giaiPTView;
	
	public GiaiPTController(GiaiPTView giaiPTView) {
		this.giaiPTView=giaiPTView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.giaiPTView.rdb_ptb1.isSelected()) {
//			JOptionPane.showMessageDialog(null, "Da nhan phuong trinh bac 1");
			this.giaiPTView.btn_giai.setEnabled(true);
			String src=e.getActionCommand();
			if (src.equals("Giải")) {
				this.giaiPTView.giaiPTBac1();
			}
			else if (src.equals("Thoát")) {
				System.exit(0);
			}
			
		}
		else if (this.giaiPTView.rdb_ptb2.isSelected()) {
//			JOptionPane.showMessageDialog(null, "Da nhan phuong trinh bac 2");
			this.giaiPTView.btn_giai.setEnabled(true);
			this.giaiPTView.textField_c.setEditable(true);
			String src=e.getActionCommand();
			if (src.equals("Giải")) {
				this.giaiPTView.giaiPTBac2();
			}
			else if (src.equals("Thoát")) {
				System.exit(0);
			}
			
			
		}
	}
	
}
