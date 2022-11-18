package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMultiple {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementSystem", "root", "root");
			System.out.println("connection established");
			
			
			PreparedStatement ps = con.prepareStatement("Insert into school (id,name,rollno,std) values(?,?,?,?)");
			ps.setInt(1, 9);
			ps.setString(2, "riva");
			ps.setInt(3, 9);
			ps.setInt(4, 9);
			ps.execute();
//			============================
			ps.setInt(1, 10);
			ps.setString(2, "avni");
			ps.setInt(3, 10);
			ps.setInt(4, 9);
			
			ps.execute();
			
			
			System.out.println("data inserted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
