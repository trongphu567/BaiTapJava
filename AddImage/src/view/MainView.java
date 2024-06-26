package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame {
	private JMenu menu,subMenu;
	private JMenuItem i1,i2,i3,i4,i5;
	private JButton jButton;
	private JLabel jLabel;
	
	public MainView() {
		this.setTitle("Add Image");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		//set icon cho JFrame
		URL iconProgram=MainView.class.getResource("notepad.png");
		Image img=Toolkit.getDefaultToolkit().createImage(iconProgram);
		this.setIconImage(img);
		
		//menu bar
		JMenuBar jMenuBar=new JMenuBar();
		menu=new JMenu("File");
		subMenu=new JMenu("Sub Menu");
		i1=new JMenuItem("New");
		i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("new.png"))));
		i2=new JMenuItem("Open");
		i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("open.png"))));
		i3=new JMenuItem("Save");
		i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("save.png"))));
		i4=new JMenuItem("Save As");
		i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("save as.png"))));
		i5=new JMenuItem("Exit");
		i5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("exit.png"))));
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(subMenu);
		subMenu.add(i4);
		subMenu.add(i5);
		jMenuBar.add(menu);
		
		//jbutton
		jButton=new JButton("TEST BUTTON");
		jButton.setFont(new Font("Arial",Font.BOLD,40));
		jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("exit.png"))));
		//jLabel
		jLabel=new JLabel();
		jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("stackoverflow.png"))));
		
		//add vao chuong trinh
		this.setJMenuBar(jMenuBar);
		this.add(jLabel,BorderLayout.CENTER);
		this.add(jButton,BorderLayout.SOUTH);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		MainView mainView=new MainView();
	}
}
