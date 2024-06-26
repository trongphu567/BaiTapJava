package controller;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.plaf.multi.MultiLookAndFeel;

import view.ThucDonView;

public class ThucDonController implements ActionListener{
	private ThucDonView thucDonView;
	
	public ThucDonController(ThucDonView thucDonView) {
		this.thucDonView=thucDonView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		String monChinh="";
//		Enumeration<AbstractButton> buttons_monChinh= thucDonView.btnGroup_monChinh.getElements();
//		while (buttons_monChinh.hasMoreElements()) {
//			AbstractButton b=buttons_monChinh.nextElement();
//			if (b.isSelected()) 
//				monChinh=b.getText();
		String monChinh=thucDonView.jComboBox_monChinh.getSelectedItem().toString();
		
		String monPhu="";
		
		Object[] lstMonPhu=thucDonView.jList_monPhu.getSelectedValues();
		for(Object o:lstMonPhu) {
			monPhu=monPhu+o.toString();
		}
			
//		String monPhu="";
//		Enumeration<AbstractButton> buttons_monPhu=thucDonView.btnGroup_momPhu.getElements();
//		while (buttons_monPhu.hasMoreElements()) {
//			AbstractButton btn=buttons_monPhu.nextElement();
//			if (btn.isSelected())
//				monPhu=monPhu+btn.getText();
//		}
		thucDonView.thucDonModel.setLuaChon_monChinh(monChinh);
		thucDonView.thucDonModel.setLuaChon_monPhu(monPhu);
		thucDonView.thucDonModel.tinhTongTien();
		thucDonView.hienThiKetQua();
		
		String soTien_chuoi=(String) JOptionPane.showInputDialog(thucDonView, (thucDonView.jLabel_tongTien.getText()+"\nNhap vao so tien tra:"),"Thong bao",JOptionPane.QUESTION_MESSAGE);
		try {
			long soTien=Long.valueOf(soTien_chuoi);
			JOptionPane.showMessageDialog(thucDonView, "Tien khach tra : "+soTien_chuoi+"\nTien tra lai cho khach: "+(soTien-thucDonView.thucDonModel.getTongTien())+"\nCam on quy khach da mua hang!"
					, "Thong bao",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Da thanh toan tien!");
		}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(thucDonView, "Nhap du lieu sai", "Error",JOptionPane.ERROR_MESSAGE);
			System.out.println("Da nhap sai tien!");
		}
		
		
	}


}
