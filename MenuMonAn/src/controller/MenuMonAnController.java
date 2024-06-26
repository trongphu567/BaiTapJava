package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

import model.MenuMonAnModel;
import view.MenuMonAnView;

public class MenuMonAnController implements ActionListener {
	private MenuMonAnView menuMonAnView;
	
	public MenuMonAnController(MenuMonAnView menuMonAnView) {
		this.menuMonAnView = menuMonAnView;
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		int str=0;
		String mon="";
		if (menuMonAnView.checkbox_miTom.isSelected()) { 
			str+=20000;
			mon+=menuMonAnView.checkbox_miTom.getText()+"\n";
		}
		if (menuMonAnView.checkbox_banhMi.isSelected()) {
			str+=15000;
			mon+=menuMonAnView.checkbox_banhMi.getText()+"\n";
		}
		if (menuMonAnView.checkBox_bunBo.isSelected()) {
			str+=30000;
			mon+=menuMonAnView.checkBox_bunBo.getText()+"\n";
		}
		if (menuMonAnView.checkBox_nuocLoc.isSelected()) {
			str+=6000;
			mon+=menuMonAnView.checkBox_nuocLoc.getText()+"\n";
		}
		if (menuMonAnView.checkbox_coca.isSelected()) {
			str+=12000;
			mon+=menuMonAnView.checkbox_coca.getText()+"\n";
		}
		this.menuMonAnView.jTextField_tongTien.setText(str+"");
		JOptionPane.showMessageDialog(null, "Danh sach cac mon da chon:\n"+mon+"Tong tien: "+str, "Thong bao",JOptionPane.PLAIN_MESSAGE);
		this.menuMonAnView.jTextField_khachDua.setEditable(true);
		
	}
	
	
}
