package view;

import javax.swing.JFrame;

public class SwingExample {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		//gan ten cua so
		jf.setTitle("Vi du JFrame");
		//gan kich co
		jf.setSize(600,400);
		
//		while(true)
//			System.out.println("Chuong trinh dang chay!");
		//gan vi tri hien thi cua so
		jf.setLocation(400,100);
		
		//thoat ra chuong trinh khi dong cua so JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//cho phep hien thi
		jf.setVisible(true);
	}
}
