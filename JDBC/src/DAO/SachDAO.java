package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCExample;
import model.Sach;

public class SachDAO implements DAOInterface<Sach>{

	public static SachDAO getInstance() {
		return new SachDAO();
	}
	@Override
	public int insert(Sach t) {
		int kq=0;
		try {
		
		Connection con=JDBCExample.getConnection();
		Statement st=con.createStatement();
		String sql="INSERT INTO sach "+
						" VALUES ('"+t.getId()+"','"+t.getTenSach()+"',"+t.getGiaBan()+",'"+t.getNamXuatBan()+"')";
		
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
	public int update(Sach t) {
		int kq=0;
		try {
		
		Connection con=JDBCExample.getConnection();
		Statement st=con.createStatement();
		String sql="UPDATE sach "+
						" SET "+" tenSach='"+t.getTenSach()+"',"+" giaBan="+t.getGiaBan()+","+"namXuatBan='"+t.getNamXuatBan()+"'"
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
	public int delete(Sach t) {
		int kq=0;
		try {
		
		Connection con=JDBCExample.getConnection();
		Statement st=con.createStatement();
		String sql="DELETE FROM sach "+" WHERE id='"+t.getId()+"'";
		
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
	public ArrayList<Sach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sach selectById(Sach t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
