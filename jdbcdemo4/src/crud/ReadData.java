package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "root");
			System.out.println("We Are Ready To Go");
			
			PreparedStatement ps = con.prepareStatement("select * from india where capno=7 ");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString(1)+" ");
				System.out.print(rs.getInt(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			
		}
		
	}
}
