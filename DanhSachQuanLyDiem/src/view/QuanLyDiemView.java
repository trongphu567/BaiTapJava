package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class QuanLyDiemView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_masv;
	private JTextField textField_tensv;
	private JTextField textField_diem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyDiemView frame = new QuanLyDiemView();
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
	public QuanLyDiemView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDanhSchQun = new JLabel("DANH SÁCH QUẢN LÝ ĐIỂM");
		lblDanhSchQun.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSchQun.setForeground(Color.BLUE);
		lblDanhSchQun.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDanhSchQun.setBounds(174, 10, 415, 46);
		contentPane.add(lblDanhSchQun);
		
		JPanel panel_content = new JPanel();
		panel_content.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_content.setBounds(10, 46, 766, 266);
		contentPane.add(panel_content);
		panel_content.setLayout(null);
		
		JLabel lblMSv = new JLabel("Mã SV");
		lblMSv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMSv.setBounds(31, 22, 105, 40);
		panel_content.add(lblMSv);
		
		JLabel lblTnSv = new JLabel("Tên SV");
		lblTnSv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTnSv.setBounds(28, 80, 84, 29);
		panel_content.add(lblTnSv);
		
		JLabel lblim = new JLabel("Điểm");
		lblim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblim.setBounds(31, 132, 81, 29);
		panel_content.add(lblim);
		
		textField_masv = new JTextField();
		textField_masv.setBounds(132, 25, 277, 29);
		panel_content.add(textField_masv);
		textField_masv.setColumns(10);
		
		textField_tensv = new JTextField();
		textField_tensv.setColumns(10);
		textField_tensv.setBounds(132, 82, 277, 29);
		panel_content.add(textField_tensv);
		
		textField_diem = new JTextField();
		textField_diem.setColumns(10);
		textField_diem.setBounds(132, 132, 277, 29);
		panel_content.add(textField_diem);
		
		JButton btn_them = new JButton("Thêm");
		btn_them.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_them.setBounds(625, 19, 102, 40);
		panel_content.add(btn_them);
		
		JButton btn_sua = new JButton("Sửa");
		btn_sua.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_sua.setBounds(625, 86, 102, 40);
		panel_content.add(btn_sua);
		
		JButton btn_xoa = new JButton("Xoá");
		btn_xoa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_xoa.setBounds(625, 157, 102, 40);
		panel_content.add(btn_xoa);
		
		JButton btn_thoat = new JButton("Thoát");
		btn_thoat.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_thoat.setBounds(625, 216, 102, 40);
		panel_content.add(btn_thoat);
	}
}
