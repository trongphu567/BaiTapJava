package test;

import java.sql.Connection;
import java.sql.Date;

import DAO.KhachHangDAO;
import DAO.SachDAO;
import database.JDBCExample;
import model.Khachhang;
import model.Sach;

public class JDBCTest {
	public static void main(String[] args) {
		Sach sach1=new Sach("s1", "Nha Gia Kim", 100000, 2020);
		Sach sach2=new Sach("s2", "Nhung dieu bi mat", 150000, 2015);
		Sach sach3=new Sach("s2","1001 con cho dom",250000,1999);
//		SachDAO.getInstance().insert(sach1);
//		SachDAO.getInstance().update(sach3);
//		SachDAO.getInstance().delete(sach3);
		
		Khachhang kh1=new Khachhang("kh1", "Nguyen Minh Tam","15-8-1991", "Binh Duong");
		Khachhang kh2=new Khachhang("kh2", "Tran Thi Minh Thu","20-2-1995", "TPHCM");
		KhachHangDAO.getInstace().insert(kh1);
		KhachHangDAO.getInstace().insert(kh2);
		Khachhang kh3=new Khachhang("kh2", "Pham Van Phuoc", "9-7-1982", "Ha Noi");
		KhachHangDAO.getInstace().update(kh3);
		KhachHangDAO.getInstace().delete(kh3);
	}
}
