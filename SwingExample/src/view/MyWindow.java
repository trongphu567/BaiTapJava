package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showWindow() {
		this.setVisible(true);
	}
	public void showWindow(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	public void showWindow(String title,int width,int height) {
		this.setTitle(title);
		this.setSize(300,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyWindow mw1=new MyWindow();
		mw1.showWindow();
		MyWindow mw2=new MyWindow();
		mw2.showWindow("Example JFrame");
		MyWindow mw3=new MyWindow();
		mw3.showWindow("Example",400,100);
	}
	
}
