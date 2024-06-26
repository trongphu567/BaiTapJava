package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.jdbc;
import model.NhanVien;

public class daoNhanVien implements daoInterface<NhanVien> {
	public static daoNhanVien getInstance() { return new daoNhanVien();}

	@Override
	public int insert(NhanVien t) {
		Connection c=jdbc.getConnection();
		Statement st=null;
		try {
			st = c.createStatement();
		} catch (SQLException e1) {
			System.out.println("Can't create statement");
			e1.printStackTrace();
		}
		String sql="INSERT INTO nvien(id, hoten, gioitinh, ngaysinh, diachi, sdt, chucvu, isDeleted)"
				+ " VALUES ('"+t.getID()+"' , N'"+t.getHoten()+"' , N'"+t.getGioitinh()+"' , '"+t.getNgaysinh()+"' ,"
				+"N'"+t.getDiachi()+"', '"+t.getSdt()+"' , N'"+t.getChucvu()+"' , 0)";
		int kq=0;
		try {
			kq = st.executeUpdate(sql);
		} 
		catch (SQLException e) {
			System.out.println("Can't execute");
			e.printStackTrace();}
		System.out.println(sql);
		System.out.println("Co "+kq+" dong duoc thay doi");
		jdbc.closeConnection(c);
		return 0;
	}

	@Override
	public int update(String pid, NhanVien t) {
		Connection c=jdbc.getConnection();
		Statement st=null;
		try {
			st = c.createStatement();
		} catch (SQLException e1) {
			System.out.println("Can't create statement");
			e1.printStackTrace();
		}
		String sql ="UPDATE nvien "+
					" SET "+
					" id='"+t.getID()+"'"+
					", hoten=N'"+t.getHoten()+"'"+
					", gioitinh=N'"+t.getGioitinh()+"'"+
					", ngaysinh='"+t.getNgaysinh()+"'"+
					", diachi=N'"+t.getDiachi()+"'"+
					", sdt='"+t.getSdt()+"'"+
					", chucvu=N'"+t.getChucvu()+"'"+
					", isDeleted=0"+
					" WHERE id='"+pid+"\'";
		System.out.println(sql);
		int kq=0;
		try {
			kq=st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Can't execute");
			e.printStackTrace();
		}
		System.out.println("Co "+kq+" dong duoc thay doi");
		jdbc.closeConnection(c);
		return 0;
	}

	@Override
	public int delete(NhanVien t) {
		Connection c=jdbc.getConnection();
		Statement st=null;
		try {
			st = c.createStatement();
		} catch (SQLException e1) {
			System.out.println("Can't create statement");
			e1.printStackTrace();
		}
		String sql ="UPDATE nvien "+
					" SET "+
					" isDeleted=1"+
					" WHERE id='"+t.getID()+"\'";
		int kq=0;
		try {
			kq=st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Can't execute");
			e.printStackTrace();
		}
		System.out.println(sql);
		System.out.println("Co "+kq+" dong duoc thay doi");
		jdbc.closeConnection(c);
		return 0;
	}

	@Override
	public ArrayList<NhanVien> importDTB() {
		ArrayList<NhanVien> kq=new ArrayList<NhanVien>();
		try {
		Connection c = jdbc.getConnection();
		Statement st=c.createStatement();
		String sql="SELECT * FROM nvien";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			String id=rs.getString("id");
			String hoTen=rs.getString("hoten");
			String gioiTinh=rs.getString("gioitinh");
			String ngaySinh=rs.getString("ngaysinh");
			String diaChi=rs.getString("diachi");
			String sdt=rs.getString("sdt");
			String chucVu=rs.getString("chucvu");
			NhanVien nv=new NhanVien(id,hoTen,gioiTinh,ngaySinh,diaChi,sdt,chucVu);
			kq.add(nv);
		}
		
		jdbc.closeConnection(c);
		}
		catch(SQLException e) {e.printStackTrace();}
		return kq;
	}
	
	@Override
	public NhanVien selectByID(NhanVien t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<NhanVien> selectByCondition(String cd) {
		// TODO Auto-generated method stub
		return null;
	}

}
