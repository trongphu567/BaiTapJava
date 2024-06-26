package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.MenuBarView;

public class MenuBarMouseListener implements MouseListener{
	private MenuBarView menuBarView;
	
	public MenuBarMouseListener(MenuBarView menuBarView) {
		this.menuBarView = menuBarView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.isPopupTrigger()) {
			this.menuBarView.jPopupMenu.show(e.getComponent(),e.getX(),e.getY());
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.isPopupTrigger()) {
			this.menuBarView.jPopupMenu.show(e.getComponent(),e.getX(),e.getY());
		}
	}	

	

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
