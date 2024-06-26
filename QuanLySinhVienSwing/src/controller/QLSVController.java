package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.QLSVView;

public class QLSVController implements ActionListener{

	public QLSVView view;
	
	public QLSVController(QLSVView view) {
		this.view=view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src=e.getActionCommand();
		JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: "+src);
		if (src.equals("Thêm")) 
			this.view.xoaForm();
	}
	
}
