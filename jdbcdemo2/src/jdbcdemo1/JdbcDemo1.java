package jdbcdemo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class JdbcDemo1 {
	public static void main(String[] args)  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		Statement st = con.createStatement();
		
		System.out.println("Connection Establish Successfully");
		st.execute("create database jdbc");
		System.out.println("database created successfully");
		}
		catch(ClassNotFoundException e){ 
			
		}
		catch(SQLException q) {
			
		}
	}
}
