package database;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
	public static Connection getConnection() {
		Connection c=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			try {
				String url="jdbc:sqlserver://DESKTOP-KMNS09Q\\SQLEXPRESS:1433;database=NVIEN;user=me;password=2003;encrypt=true;trustServerCertificate=true;";
				c=DriverManager.getConnection(url);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Ket noi thanh cong");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Ket noi khong thanh cong");
			e.printStackTrace();
		} 
		return c;
	}
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) c.close();
		}
		catch(Exception e) {e.printStackTrace();}
	}
}
