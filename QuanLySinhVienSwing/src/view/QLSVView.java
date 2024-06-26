package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	private QLSVModel model;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model=new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 636);
		
		ActionListener actionListener=new QLSVController(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Close");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("About");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("About me...");
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quê quán");
		lblNewLabel.setBounds(38, 27, 99, 43);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox_queQuan = new JComboBox();
		comboBox_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ArrayList<tinh> listTinh=tinh.getDSTinh();
		comboBox_queQuan.addItem("");
		for (tinh t:listTinh) {
			comboBox_queQuan.addItem(t.getTenTinh());
		}
		comboBox_queQuan.setBounds(163, 30, 187, 43);
		contentPane.add(comboBox_queQuan);
		
		JLabel lblNewLabel_1 = new JLabel("Mã sinh viên");
		lblNewLabel_1.setBounds(389, 36, 116, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(512, 30, 187, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setBounds(739, 27, 85, 43);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnNewButton);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(38, 88, 833, 12);
		contentPane.add(separator_2);
		
		JLabel lblDanhSchTh = new JLabel("Danh sách thí sinh");
		lblDanhSchTh.setBounds(10, 99, 187, 43);
		lblDanhSchTh.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDanhSchTh);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "Mã thí sinh", "Họ tên", "Quê quán", "Giới tính", "Điểm 1", "Điểm 2","Điểm 3"
			}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 147, 916, 197);
		contentPane.add(scrollPane);
		
		JLabel lblThngTnTh = new JLabel("Thông tin thí sinh");
		lblThngTnTh.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThngTnTh.setBounds(10, 354, 187, 43);
		contentPane.add(lblThngTnTh);
		
		JLabel lblNewLabel_2 = new JLabel("Mã thí sinh");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(20, 395, 117, 33);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setBounds(142, 397, 152, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Họ và tên");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(20, 438, 117, 33);
		contentPane.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(142, 438, 152, 33);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quê quán");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(327, 390, 99, 43);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_queQuan_1 = new JComboBox();
		comboBox_queQuan_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_queQuan_1.addItem("");
		for (tinh t:listTinh) {
			comboBox_queQuan_1.addItem(t.getTenTinh());
		}
		comboBox_queQuan_1.setBounds(449, 396, 172, 35);
		contentPane.add(comboBox_queQuan_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Ngày sinh");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(15, 471, 122, 43);
		contentPane.add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(142, 478, 152, 33);
		contentPane.add(textField_4);
		
		table_1 = new JTable();
		table_1.setBounds(0, 0, 1, 1);
		contentPane.add(table_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Giới tính");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(327, 438, 117, 33);
		contentPane.add(lblNewLabel_2_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBounds(449, 444, 90, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nữ");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.setBounds(541, 444, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup jRadioGroup=new ButtonGroup();
		jRadioGroup.add(rdbtnNewRadioButton);
		jRadioGroup.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Môn 1");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2_1.setBounds(327, 476, 117, 33);
		contentPane.add(lblNewLabel_2_2_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(449, 478, 152, 33);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Môn 2");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2_1_1.setBounds(655, 395, 78, 33);
		contentPane.add(lblNewLabel_2_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(758, 397, 152, 33);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Môn 3");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2_1_1_1.setBounds(650, 438, 83, 33);
		contentPane.add(lblNewLabel_2_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(758, 440, 152, 33);
		contentPane.add(textField_6);
		
		JButton btn_them = new JButton("Thêm");
		btn_them.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_them.setBounds(20, 524, 99, 37);
		btn_them.addActionListener(actionListener);
		contentPane.add(btn_them);
		
		JButton btn_xoa = new JButton("Xoá");
		btn_xoa.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_xoa.setBounds(196, 524, 85, 37);
		btn_xoa.addActionListener(actionListener);
		contentPane.add(btn_xoa);
		
		JButton btn_capnhat = new JButton("Cập nhật");
		btn_capnhat.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_capnhat.setBounds(378, 524, 127, 37);
		btn_capnhat.addActionListener(actionListener);
		contentPane.add(btn_capnhat);
		
		JButton btn_luu = new JButton("Lưu");
		btn_luu.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_luu.setBounds(603, 524, 85, 37);
		btn_luu.addActionListener(actionListener);
		contentPane.add(btn_luu);
		
		JButton btn_huybo = new JButton("Huỷ bỏ");
		btn_huybo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_huybo.setBounds(775, 524, 116, 37);
		btn_huybo.addActionListener(actionListener);
		contentPane.add(btn_huybo);
		
		
	
		this.setVisible(true);
	}
}
