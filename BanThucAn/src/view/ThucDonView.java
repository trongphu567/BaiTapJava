package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.ThucDonController;
import model.ThucDonModel;

public class ThucDonView extends JFrame{
	public ThucDonModel thucDonModel;
	private JRadioButton jRadioButton_com;
	private JRadioButton jRadioButton_pho;
	private JRadioButton jRadioButton_bun;
	public ButtonGroup btnGroup_monChinh;
	private JCheckBox jCheckBox_traSua;
	private JCheckBox jCheckBox_nuocNgot;
	private JCheckBox jCheckBox_kem;
	public ButtonGroup btnGroup_momPhu;
	public JLabel jLabel_monChinh,jLabel_monPhu,jLabel_tongTien;
	public JLabel jLabel_thongTin;
	public JComboBox<String> jComboBox_monChinh;
	public JList<String> jList_monPhu;

	public ThucDonView() {
		this.thucDonModel = new ThucDonModel();
		this.init();
	}
	public void init() {
		this.setTitle("Thuc Don");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		Font font=new Font("Arial",Font.BOLD,20);
		
		JLabel header=new JLabel("THUC DON HOM NAY");
		header.setFont(font);
		JPanel jPanel_header=new JPanel();
		jPanel_header.add(header);
		this.add(jPanel_header,BorderLayout.NORTH);
		
		
		JPanel jPanel_monChinh=new JPanel();
//		jPanel_monChinh.setLayout(new GridLayout(1,3));
		jPanel_monChinh.setLayout(new FlowLayout());
		String[] cacMonChinh=new String[] {"Com","Pho","Bun"};
		jComboBox_monChinh=new JComboBox<String>(cacMonChinh);
		jComboBox_monChinh.setFont(font);
		jPanel_monChinh.add(jComboBox_monChinh);
//		jRadioButton_com=new JRadioButton("Com");
//		jRadioButton_com.setFont(font);
//		jRadioButton_pho=new JRadioButton("Pho");
//		jRadioButton_pho.setFont(font);
//		jRadioButton_bun=new JRadioButton("Bun");
//		jRadioButton_bun.setFont(font);
//		btnGroup_monChinh=new ButtonGroup();
//		btnGroup_monChinh.add(jRadioButton_com);
//		btnGroup_monChinh.add(jRadioButton_pho);
//		btnGroup_monChinh.add(jRadioButton_bun);
//		jPanel_monChinh.add(jRadioButton_com);
//		jPanel_monChinh.add(jRadioButton_pho);
//		jPanel_monChinh.add(jRadioButton_bun);
		
		JPanel jPanel_monPhu=new JPanel();
		jPanel_monPhu.setLayout(new GridLayout(1,3));
		String[] cacMonPhu=new String[] {"Tra sua","Nuoc ngot","Kem"};
		jList_monPhu=new JList<String>(cacMonPhu);
		jList_monPhu.setFont(font);
		jPanel_monPhu.add(jList_monPhu);
//		jCheckBox_traSua=new JCheckBox("Tra sua");
//		jCheckBox_traSua.setFont(font);
//		jCheckBox_nuocNgot=new JCheckBox("Nuoc ngot");
//		jCheckBox_nuocNgot.setFont(font);
//		jCheckBox_kem=new JCheckBox("Kem");
//		jCheckBox_kem.setFont(font);
//		btnGroup_momPhu=new ButtonGroup();
//		btnGroup_momPhu.add(jCheckBox_traSua);
//		btnGroup_momPhu.add(jCheckBox_nuocNgot);
//		btnGroup_momPhu.add(jCheckBox_kem);
//		jPanel_monPhu.add(jCheckBox_traSua);
//		jPanel_monPhu.add(jCheckBox_nuocNgot);
//		jPanel_monPhu.add(jCheckBox_kem);
		
		JPanel jPanel_chonMon=new JPanel();
		jPanel_chonMon.setLayout(new GridLayout(2,1));
		jPanel_chonMon.add(jPanel_monChinh);
		jPanel_chonMon.add(jPanel_monPhu);
		this.add(jPanel_chonMon,BorderLayout.CENTER);
		
		JPanel jPanel_thanhToan=new JPanel();
		jPanel_thanhToan.setLayout(new GridLayout(4,1));
		//jLabel_thongTin=new JLabel();
		
		jLabel_monChinh=new JLabel();
		jLabel_monChinh.setFont(font);
		jLabel_monPhu=new JLabel();
		jLabel_monPhu.setFont(font);
		jLabel_tongTien=new JLabel();
		jLabel_tongTien.setFont(font);
		
		
		JButton jButton_thanhToan=new JButton("Thanh Toan");
		jButton_thanhToan.setFont(font);
		ActionListener thucDonController=new ThucDonController(this);
		jButton_thanhToan.addActionListener(thucDonController);
		
		jPanel_thanhToan.add(jLabel_monChinh);
		jPanel_thanhToan.add(jLabel_monPhu);
		jPanel_thanhToan.add(jLabel_tongTien);
		//jPanel_thanhToan.add(jLabel_thongTin);
		jPanel_thanhToan.add(jButton_thanhToan);
		
		this.add(jPanel_thanhToan,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public void hienThiKetQua() {
		this.jLabel_monChinh.setText("Mon chinh: "+this.thucDonModel.getLuaChon_monChinh());
		this.jLabel_monPhu.setText("Mon phu: "+this.thucDonModel.getLuaChon_monPhu());
		this.jLabel_tongTien.setText("Tong tien: "+this.thucDonModel.getTongTien());
		System.out.println("Da tinh tien!");
	}
}
