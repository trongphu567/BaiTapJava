package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuBarController;
import controller.MenuBarMouseListener;

public class MenuBarView extends JFrame {
	private JLabel jLabel;
	public JPopupMenu jPopupMenu;
	private JToolBar jToolBar;
	

	public MenuBarView() {
		this.setTitle("MenuBar");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MenuBarController menuBarController=new MenuBarController(this);
		//tao thanh menu
		JMenuBar jMenuBar=new JMenuBar();
		//tao 1 menu
		JMenu jMenu_file=new JMenu("File");
		jMenu_file.setMnemonic(KeyEvent.VK_F);
		//tao cac menu con
		JMenuItem jMenuItem_new=new JMenuItem("New",KeyEvent.VK_N);
		jMenuItem_new.addActionListener(menuBarController);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		JMenuItem jMenuItem_open=new JMenuItem("Open",KeyEvent.VK_O);
		jMenuItem_open.addActionListener(menuBarController);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
		JMenuItem jMenuItem_exit=new JMenuItem("Exit",KeyEvent.VK_X);
		jMenuItem_exit.addActionListener(menuBarController);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_DOWN_MASK));
		jMenu_file.add(jMenuItem_new);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);
		
		//menu view
		JMenu jMenu_view=new JMenu("View");
		jMenu_view.setMnemonic(KeyEvent.VK_V);
		JCheckBoxMenuItem jCheckBoxMenuItem_toolbar=new JCheckBoxMenuItem("Toolbar");
		jMenu_view.add(jCheckBoxMenuItem_toolbar);
		jMenu_view.addActionListener(menuBarController);
		
		JMenu jMenu_help=new JMenu("Help");
		jMenu_help.setMnemonic(KeyEvent.VK_H);
		JMenuItem jMenuItem_about=new JMenuItem("About");
		jMenuItem_about.addActionListener(menuBarController);
		JMenuItem jMenuItem_update=new JMenuItem("Update");
		jMenuItem_update.addActionListener(menuBarController);
		jMenu_help.add(jMenuItem_about);
		jMenu_help.addSeparator();
		jMenu_help.add(jMenuItem_update);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_view);
		jMenuBar.add(jMenu_help);
		//them thanh menu vao chuong trinh
		this.setJMenuBar(jMenuBar);
		
		//tao thanh cong cu
		jToolBar=new JToolBar();
		JButton jButton_undo=new JButton("Undo");
		jButton_undo.addActionListener(menuBarController);
		jButton_undo.setToolTipText("Khoi phuc thao tac");
		JButton jButton_redo=new JButton("Redo");
		jButton_redo.addActionListener(menuBarController);
		JButton jButton_copy=new JButton("Copy");
		jButton_copy.addActionListener(menuBarController);
		JButton jButton_cut=new JButton("Cut");
		jButton_cut.addActionListener(menuBarController);
		JButton jButton_paste=new JButton("Paste");
		jButton_paste.addActionListener(menuBarController);
		
		jToolBar.add(jButton_undo);
		jToolBar.add(jButton_redo);
		jToolBar.add(jButton_copy);
		jToolBar.add(jButton_cut);
		jToolBar.add(jButton_paste);
		
		//tao menu chuot phai jPopupMenu
		jPopupMenu=new JPopupMenu();
		JMenu jMenuPopupFont=new JMenu("Font");
		JMenuItem jMenuItemType=new JMenuItem("Type");
		jMenuItemType.addActionListener(menuBarController);
		JMenuItem jMenuItemSize=new JMenuItem("Size");
		jMenuItemSize.addActionListener(menuBarController);
		jMenuPopupFont.add(jMenuItemType);
		jMenuPopupFont.add(jMenuItemSize);
		
		
		JMenuItem jMenuItemCopy=new JMenuItem("Copy");
		jMenuItemCopy.addActionListener(menuBarController);
		JMenuItem jMenuItemCut=new JMenuItem("Cut");
		jMenuItemCut.addActionListener(menuBarController);
		JMenuItem jMenuItemPaste=new JMenuItem("Paste");
		jMenuItemPaste.addActionListener(menuBarController);
		
		jPopupMenu.add(jMenuPopupFont);
		jPopupMenu.addSeparator();
		jPopupMenu.add(jMenuItemCopy);
		jPopupMenu.addSeparator();
		jPopupMenu.add(jMenuItemCut);
		jPopupMenu.addSeparator();
		jPopupMenu.add(jMenuItemPaste);
		this.add(jPopupMenu);
		//them su kien click chuot phai 
		MenuBarMouseListener menuBarMouseListener=new MenuBarMouseListener(this);
		this.addMouseListener(menuBarMouseListener);
		
		//tao label hien thi
		Font font=new Font("Arial",Font.BOLD,50);
		jLabel=new JLabel("",JLabel.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(jToolBar,BorderLayout.NORTH);
		this.jToolBar.setVisible(false);
		this.add(jLabel,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}
	public void enableToolBar() {
		this.add(jToolBar,BorderLayout.NORTH);
		this.jToolBar.setVisible(true);
	}
	public void disableToolBar() {
		this.jToolBar.setVisible(false);
	}
}
