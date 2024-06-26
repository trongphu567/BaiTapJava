import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SAN PHAM");
		lblNewLabel.setBounds(10, 10, 156, 48);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(255, 26, 130, 21);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Điện thoại", "Máy tính", "Tai nghe"}));
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(175, 103, 170, 19);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ten dang nhap:");
		lblNewLabel_1.setBounds(10, 91, 115, 39);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mat khau:");
		lblNewLabel_2.setBounds(10, 156, 102, 13);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 155, 170, 19);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Them");
		btnNewButton.setBounds(10, 217, 85, 21);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sua");
		btnNewButton_1.setBounds(175, 217, 85, 21);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Xoa");
		btnNewButton_2.setBounds(341, 217, 85, 21);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Làm mới");
		btnNewButton_3.setBounds(517, 217, 85, 21);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Nuoc ngot");
		chckbxNewCheckBox.setBounds(446, 67, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Kem");
		chckbxNewCheckBox_1.setBounds(446, 104, 93, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Tra sua");
		chckbxNewCheckBox_2.setBounds(446, 26, 93, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(669, 10, 20, 253);
		scrollBar.setMaximum(50);
		contentPane.add(scrollBar);
		
		String[] columnNames = {"Name", "Age", "Gender"};
        Object[][] data = {
                {"John", 30, "Male"},
                {"Jane", 25, "Female"},
                {"Mike", 40, "Male"},
                {"Sarah", 28, "Female"}
        };

        JTable table = new JTable(data, columnNames);
//        JScrollPane scrollPane = new JScrollPane(table);

        contentPane.add(table);
        contentPane.setVisible(true);
	}
}
