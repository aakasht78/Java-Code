package jdbcbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcBasic {
	public static void main(String[]args) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		System.out.println("Connection Establish Successfull");
	}
}
