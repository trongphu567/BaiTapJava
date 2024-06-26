package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

import view.MenuBarView;

public class MenuBarController implements ActionListener {
	private MenuBarView menuBarView;
	

	public MenuBarController(MenuBarView menuBarView) {
		this.menuBarView = menuBarView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String button=e.getActionCommand();
		
		if (button.equals("Exit")) {
			System.exit(0);
		}
		else if (button.equals("Toolbar")) {
			AbstractButton checkBox=(AbstractButton) e.getSource();
			boolean check=checkBox.getModel().isSelected();
			if (check) {
				this.menuBarView.enableToolBar();
			}
			else {
				this.menuBarView.disableToolBar();
			}
		}
		else {
			this.menuBarView.setTextJLabel("Ban da nhan nut: "+button);
		}
	}
	
}
