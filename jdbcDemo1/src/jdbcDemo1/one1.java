package jdbcDemo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class one1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
	System.out.println("connection Establish successfully");
	}
}
