package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.SoftBevelBorder;

import controller.MenuMonAnController;
import model.MenuMonAnModel;

import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MenuMonAnView extends JFrame {

	public MenuMonAnModel menuMonAnModel;
	private JPanel contentPane;
	public JTextField jTextField_tongTien;
	public JTextField jTextField_khachDua;
	public JTextField jTextField_thoiTien;
	private MenuMonAnModel model;
	public JCheckBox checkbox_miTom;
	public JCheckBox checkbox_banhMi;
	public JCheckBox checkBox_bunBo;
	public JCheckBox checkBox_nuocLoc;
	public JCheckBox checkbox_coca;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMonAnView frame = new MenuMonAnView();
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
	public MenuMonAnView() {
		this.model=new MenuMonAnModel();
		this.setTitle("MENU MÓN ĂN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU MÓN ĂN");
		lblNewLabel.setBounds(256, 21, 294, 60);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel jLabel_monAn = new JLabel("Món ăn");
		jLabel_monAn.setBounds(10, 68, 89, 31);
		jLabel_monAn.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(jLabel_monAn);
		
		JLabel jLabel_nuocUong = new JLabel("Nước uống");
		jLabel_nuocUong.setBounds(10, 336, 98, 31);
		jLabel_nuocUong.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(jLabel_nuocUong);
		
		checkBox_nuocLoc = new JCheckBox("Nước lọc");
		checkBox_nuocLoc.setBounds(93, 417, 93, 21);
		checkBox_nuocLoc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(checkBox_nuocLoc);
		
		checkbox_coca = new JCheckBox("Coca cola");
		checkbox_coca.setBounds(93, 471, 93, 21);
		checkbox_coca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(checkbox_coca);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBounds(10, 377, 334, 221);
		horizontalBox_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(horizontalBox_1);
		
		JLabel jLabel_thaoTac = new JLabel("Thao tác");
		jLabel_thaoTac.setBounds(416, 68, 146, 31);
		jLabel_thaoTac.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(jLabel_thaoTac);
		
		JButton btn_tinhTien = new JButton("Tính tiền");
		btn_tinhTien.setBounds(452, 165, 110, 33);
		btn_tinhTien.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btn_tinhTien);
		ActionListener ac=new MenuMonAnController(this);
		btn_tinhTien.addActionListener(ac);
		
		JButton btn_thanhToan = new JButton("Thanh toán");
		btn_thanhToan.setBounds(590, 164, 152, 35);
		btn_thanhToan.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btn_thanhToan);
		btn_thanhToan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jTextField_khachDua.getText().isEmpty())
					JOptionPane.showMessageDialog(null,"Moi nhap so tien khach dua!","Thong bao",JOptionPane.ERROR_MESSAGE);
				int tienDu=Integer.parseInt(jTextField_khachDua.getText())-Integer.parseInt(jTextField_tongTien.getText());
				jTextField_thoiTien.setText(tienDu+"");
			}
		});
		
		JLabel jLabel_tongTien = new JLabel("Tổng tiền");
		jLabel_tongTien.setBounds(452, 256, 110, 31);
		jLabel_tongTien.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(jLabel_tongTien);
		
		
		JLabel jLabel_khachDua = new JLabel("Khách đưa");
		jLabel_khachDua.setBounds(452, 327, 98, 40);
		jLabel_khachDua.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(jLabel_khachDua);
		
		JLabel jLabel_thoiTien = new JLabel("Thối lại");
		jLabel_thoiTien.setBounds(452, 407, 98, 40);
		jLabel_thoiTien.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(jLabel_thoiTien);
		
		jTextField_tongTien = new JTextField();
		jTextField_tongTien.setBounds(566, 254, 189, 31);
		jTextField_tongTien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(jTextField_tongTien);
		jTextField_tongTien.setColumns(10);
		
		jTextField_khachDua = new JTextField();
		jTextField_khachDua.setBounds(566, 334, 191, 31);
		jTextField_khachDua.setEditable(false);
		jTextField_khachDua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(jTextField_khachDua);
		jTextField_khachDua.setColumns(10);
		
		jTextField_thoiTien = new JTextField();
		jTextField_thoiTien.setBounds(566, 407, 189, 31);
		jTextField_thoiTien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(jTextField_thoiTien);
		jTextField_thoiTien.setColumns(10);
		
		JButton btn_tiepTuc = new JButton("Tiếp tục");
		btn_tiepTuc.setBounds(452, 487, 110, 49);
		btn_tiepTuc.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btn_tiepTuc);
		btn_tiepTuc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				checkbox_miTom.setSelected(false);
				checkBox_bunBo.setSelected(false);
				checkbox_banhMi.setSelected(false);
				checkBox_nuocLoc.setSelected(false);
				checkbox_coca.setSelected(false);
				jTextField_tongTien.setText("");
				jTextField_khachDua.setText("");
				jTextField_khachDua.setEditable(false);
				jTextField_thoiTien.setText("");
			}
		});
		
		JButton btn_Thoat = new JButton("Thoát");
		btn_Thoat.setBounds(626, 487, 116, 49);
		btn_Thoat.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btn_Thoat);
		btn_Thoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Ban co muon thoat khong?","Thong bao", JOptionPane.YES_NO_OPTION);
				if (a==JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setBounds(405, 91, 374, 510);
		horizontalBox_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(horizontalBox_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 102, 334, 189);
		contentPane.add(panel);
		panel.setLayout(null);
//		panel.setLayout(new GridLayout(3, 1));
		
		checkbox_miTom = new JCheckBox("Mì tôm");
		checkbox_miTom.setBounds(96, 17, 69, 25);
		checkbox_miTom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(checkbox_miTom);
		
		checkbox_banhMi = new JCheckBox("Bánh mì");
		checkbox_banhMi.setBounds(96, 70, 77, 25);
		checkbox_banhMi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(checkbox_banhMi);
		
		checkBox_bunBo = new JCheckBox("Bún bò");
		checkBox_bunBo.setBounds(96, 120, 71, 25);
		checkBox_bunBo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(checkBox_bunBo);
		
		
		
		
	}
	public void hienThiKetQua() {
		this.jTextField_tongTien.setText(this.menuMonAnModel.getLuaChonMonAn());
		
	}
}
