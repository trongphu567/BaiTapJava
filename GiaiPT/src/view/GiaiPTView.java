package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JRadioButton;
import javax.swing.border.SoftBevelBorder;

import controller.GiaiPTController;
import model.GiaiPTModel;

import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaiPTView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_a;
	private JTextField textField_b;
	public JTextField textField_c;
	private JTextField textField_kq;
	public JRadioButton rdb_ptb1;
	public JRadioButton rdb_ptb2;
	public JButton btn_giai;
	private JLabel label_a;
	private JLabel label_b;
	public GiaiPTModel giaiPTModel=new GiaiPTModel();
	private JLabel label_kq;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public GiaiPTView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_header = new JLabel("GIẢI PHƯƠNG TRÌNH");
		label_header.setHorizontalAlignment(SwingConstants.CENTER);
		label_header.setForeground(Color.RED);
		label_header.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_header.setBounds(178, 10, 401, 67);
		contentPane.add(label_header);
		
		JLabel label_selection = new JLabel("Bạn vui lòng chọn");
		label_selection.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_selection.setBounds(40, 64, 168, 45);
		contentPane.add(label_selection);
		
		ActionListener ac=new GiaiPTController(this);
		rdb_ptb1 = new JRadioButton("Phương trình bậc nhất");
		rdb_ptb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdb_ptb1.setBounds(74, 115, 214, 21);
		contentPane.add(rdb_ptb1);
		rdb_ptb1.addActionListener(ac);
		
		rdb_ptb2 = new JRadioButton("Phương trình bậc hai");
		rdb_ptb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdb_ptb2.setBounds(74, 162, 157, 21);
		contentPane.add(rdb_ptb2);
		rdb_ptb2.addActionListener(ac);
		
		ButtonGroup rdb_group=new ButtonGroup();
		rdb_group.add(rdb_ptb1);
		rdb_group.add(rdb_ptb2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 63, 766, 128);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 198, 766, 187);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		label_a = new JLabel("Nhập a");
		label_a.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_a.setBounds(28, 10, 83, 41);
		panel_1.add(label_a);
		
		textField_a = new JTextField();
		textField_a.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_a.setBounds(148, 8, 225, 49);
		panel_1.add(textField_a);
		textField_a.setColumns(10);
		
		label_b = new JLabel("Nhập b");
		label_b.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_b.setBounds(28, 69, 83, 41);
		panel_1.add(label_b);
		
		textField_b = new JTextField();
		textField_b.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_b.setColumns(10);
		textField_b.setBounds(148, 67, 225, 49);
		panel_1.add(textField_b);
		
		JLabel label_c = new JLabel("Nhập c");
		label_c.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_c.setBounds(28, 134, 83, 41);
		panel_1.add(label_c);
		
		textField_c = new JTextField();
		textField_c.setEditable(false);
		textField_c.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_c.setColumns(10);
		textField_c.setBounds(148, 126, 225, 49);
		panel_1.add(textField_c);
		
		btn_giai = new JButton("Giải");
		btn_giai.setEnabled(false);
		btn_giai.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_giai.addActionListener(ac);
		
		btn_giai.setBounds(513, 10, 161, 60);
		panel_1.add(btn_giai);
		
		JButton btn_thoat = new JButton("Thoát");
		btn_thoat.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_thoat.setBounds(513, 100, 161, 60);
		panel_1.add(btn_thoat);
		btn_thoat.addActionListener(ac);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 395, 766, 67);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		label_kq = new JLabel("Kết quả");
		label_kq.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_kq.setBounds(27, 10, 83, 41);
		panel_2.add(label_kq);
		
		textField_kq = new JTextField();
		textField_kq.setEditable(false);
		textField_kq.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_kq.setBounds(145, 9, 486, 47);
		panel_2.add(textField_kq);
		textField_kq.setColumns(10);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void giaiPTBac1() {
		if (this.textField_a.getText().isEmpty() || this.textField_b.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Du lieu dang trong", "Loi", JOptionPane.ERROR_MESSAGE);
		}
		else {
			int soA=Integer.valueOf(this.textField_a.getText());
			int soB=Integer.valueOf(this.textField_b.getText());
			this.giaiPTModel.setA(soA);
			this.giaiPTModel.setB(soB);
			this.textField_kq.setText(this.giaiPTModel.giaiPTBac1(soA, soB));
		
		}
	}
	public void giaiPTBac2() {
		if (this.textField_a.getText().isEmpty() || this.textField_b.getText().isEmpty() || this.textField_c.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Du lieu dang trong", "Loi", JOptionPane.ERROR_MESSAGE);
		}
		else {
			int soA=Integer.valueOf(this.textField_a.getText());
			int soB=Integer.valueOf(this.textField_b.getText());
			int soC=Integer.valueOf(this.textField_c.getText());
			this.giaiPTModel.setA(soA);
			this.giaiPTModel.setB(soB);
			this.giaiPTModel.setC(soC);
			this.textField_kq.setText(this.giaiPTModel.giaiPTBac2(soA, soB, soC));
		
		}
	}
}
