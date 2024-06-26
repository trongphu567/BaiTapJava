import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class QLSinhVien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSinhVien frame = new QLSinhVien();
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
	public QLSinhVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(800,600));
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQunLSinh = new JLabel("Quản lý sinh viên");
		lblQunLSinh.setForeground(Color.BLUE);
		lblQunLSinh.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQunLSinh.setBounds(300, 10, 229, 38);
		contentPane.add(lblQunLSinh);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 55, 786, 291);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMSinhVin = new JLabel("Mã sinh viên:");
		lblMSinhVin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMSinhVin.setBounds(21, 10, 120, 35);
		panel.add(lblMSinhVin);
		
		textField = new JTextField();
		textField.setBounds(119, 10, 154, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(474, 12, 193, 35);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTnSinhVin = new JLabel("Tên sinh viên:");
		lblTnSinhVin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTnSinhVin.setBounds(352, 12, 112, 35);
		panel.add(lblTnSinhVin);
		
		JLabel lblGiiTnh = new JLabel("Giới tính:");
		lblGiiTnh.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGiiTnh.setBounds(21, 94, 100, 35);
		panel.add(lblGiiTnh);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 94, 155, 35);
		panel.add(textField_2);
		textField_2.setColumns(10);
	}
}
