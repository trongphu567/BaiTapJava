package connectdb;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dbUrl="jdbc:sqlserver://DESKTOP-3G6LJQB\\TRONGPHU:1433;DatabaseName=QLSV_TTPHU";
			
			Connection con=DriverManager.getConnection(dbUrl,"sa", "123456");
			Statement statement=con.createStatement();
			String exp="SELECT * FROM SVIEN";
			ResultSet rSet=statement.executeQuery(exp);
			while (rSet.next())
				System.out.println(rSet.getString("TENSV"));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
