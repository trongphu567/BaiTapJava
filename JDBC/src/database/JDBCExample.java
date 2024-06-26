package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;


public class JDBCExample {
	//tao ket noi
	public static Connection getConnection() {
		Connection c=null;
		try {
			String url="jdbc:sqlserver://DESKTOP-3G6LJQB\\TRONGPHU:1433;DatabaseName=nhasach";
			String username="sa";
			String password="123456";
			
			c=DriverManager.getConnection(url,username,password);
			//tao ra doi tuong statement
			//thuc thi 1 cau lenh sql

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	public static void closeConnection(Connection c) {
		try {
		if (c!=null) 
			c.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void printInfo(Connection c) {
		try {
			if (c!=null) {
				DatabaseMetaData data=c.getMetaData();
				System.out.println(data.getDatabaseProductName());
				System.out.println(data.getDatabaseProductVersion());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
