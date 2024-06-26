package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCExample;
import model.Khachhang;

public class KhachHangDAO implements DAOInterface<Khachhang>{

	public static KhachHangDAO getInstace() {
		return new KhachHangDAO();
	}
	@Override
	public int insert(Khachhang t) {
		int kq=0;
		try {
		
		Connection con=JDBCExample.getConnection();
		Statement st=con.createStatement();
		String sql="INSERT INTO khachhang "+
						" VALUES ('"+t.getId()+"','"+t.getHoVaTen()+"','"+t.getNgaySinh()+"','"+t.getDiaChi()+"')";
		
		kq=st.executeUpdate(sql);
		
		System.out.println("Ban da thuc thi:"+sql);
		System.out.println("Co "+kq+" dong bi thay doi !");
		
		JDBCExample.closeConnection(con);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public int update(Khachhang t) {
		int kq=0;
		try {
		
		Connection con=JDBCExample.getConnection();
		Statement st=con.createStatement();
		String sql="UPDATE khachhang "+
				"SET hoVaTen='"+t.getHoVaTen()+"',ngaySinh='"+t.getNgaySinh()+"',diaChi='"+t.getDiaChi()+"'"
				+" WHERE id='"+t.getId()+"'";
		
		kq=st.executeUpdate(sql);
		
		System.out.println("Ban da thuc thi:"+sql);
		System.out.println("Co "+kq+" dong bi thay doi !");
		
		JDBCExample.closeConnection(con);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public int delete(Khachhang t) {
		int kq=0;
		try {
		
		Connection con=JDBCExample.getConnection();
		Statement st=con.createStatement();
		String sql="DELETE FROM khachhang "
				+" WHERE id='"+t.getId()+"'";
		
		kq=st.executeUpdate(sql);
		
		System.out.println("Ban da thuc thi:"+sql);
		System.out.println("Co "+kq+" dong bi thay doi !");
		
		JDBCExample.closeConnection(con);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public ArrayList<Khachhang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Khachhang selectById(Khachhang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Khachhang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
