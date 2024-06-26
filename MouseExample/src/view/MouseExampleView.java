package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseExampleController;
import model.MouseExampleModel;

public class MouseExampleView extends JFrame {
	private MouseExampleModel mouseExampleModel;
	private JPanel jPanel_mouse;
	private JLabel jLabel_position;
	private JLabel jLabel_x;
	private JLabel jLabel_y;
	private JLabel jLabel_count;
	private JLabel jLabel_count_value;
	private JLabel jLabel_empty1;
	private JLabel jLabel_checkin;
	private JLabel jLabel_checkin_value;
	private JLabel jLabel_empty2;

	public MouseExampleView() {
		this.mouseExampleModel =new MouseExampleModel();
		this.init();
	}
	public void init() {
		this.setTitle("Mouse Example");
		this.setSize(600,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font=new Font("Arial",Font.BOLD,14);
		MouseExampleController mouseExampleController=new MouseExampleController(this);
		
		jPanel_mouse=new JPanel();
		jPanel_mouse.setBackground(Color.BLUE);
		jPanel_mouse.addMouseListener(mouseExampleController);
		jPanel_mouse.addMouseMotionListener(mouseExampleController);
		
		JPanel jPanel_info=new JPanel();
		jPanel_mouse.setLayout(new GridLayout(3,3));
		
		jLabel_position=new JLabel("Position: ");
		jLabel_position.setFont(font);
		jLabel_x=new JLabel("x = ");
		jLabel_x.setFont(font);
		jLabel_y=new JLabel("y = ");
		jLabel_y.setFont(font);
		jLabel_count=new JLabel("Number of clicks: ");
		jLabel_count.setFont(font);
		jLabel_count_value=new JLabel("0");
		jLabel_count_value.setFont(font);
		jLabel_empty1=new JLabel();
		jLabel_empty1.setFont(font);
		jLabel_checkin=new JLabel("Mouse is in component: ");
		jLabel_checkin.setFont(font);
		jLabel_checkin_value=new JLabel("No");
		jLabel_checkin_value.setFont(font);
		jLabel_empty2=new JLabel();
		jLabel_empty2.setFont(font);
		
		jPanel_info.add(jLabel_position);
		jPanel_info.add(jLabel_x);
		jPanel_info.add(jLabel_y);
		jPanel_info.add(jLabel_count);
		jPanel_info.add(jLabel_count_value);
		jPanel_info.add(jLabel_empty1);
		jPanel_info.add(jLabel_checkin);
		jPanel_info.add(jLabel_checkin_value);
		jPanel_info.add(jLabel_empty2);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_mouse,BorderLayout.CENTER);
		this.add(jPanel_info,BorderLayout.SOUTH);
		
		
		this.setVisible(true);
	}
	public void click() {
		this.mouseExampleModel.addClick();
		this.jLabel_count_value.setText(this.mouseExampleModel.getCount()+"");
	}
	public void enter() {	
		this.mouseExampleModel.enter();
		this.jLabel_checkin_value.setText(this.mouseExampleModel.getCheckIn());
	}
	public void exit() {
		this.mouseExampleModel.exit();
		this.jLabel_checkin_value.setText(this.mouseExampleModel.getCheckIn());
	}
	public void update(int x, int y) {
		this.mouseExampleModel.setX(x);
		this.mouseExampleModel.setY(y);
		this.jLabel_x.setText(this.mouseExampleModel.getX()+"");
		this.jLabel_y.setText(this.mouseExampleModel.getY()+"");
	}
	
	
	
}
