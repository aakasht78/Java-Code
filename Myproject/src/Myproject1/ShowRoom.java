package Myproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowRoom {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom", "root", "root");
		System.out.println("We Are Ready To Go");
		
		Statement st = con.createStatement();
		
//		st.execute("create database showroom");
//		System.out.println("database created successfully");
		
//		st.execute("create table showrooms(id int, name varchar(50), branch varchar(100))");
//		System.out.println("table created successfully");
		
//		st.execute("insert into showrooms (id, name, branch) values (01, 'SoloCarShowroom', 'Pune-Banglore Highway Branch')");

//		st.execute("insert into showrooms (id, name, branch) values (02, 'NNC-CarShowroom', 'Pune Deccan Branch'),(03, 'Naysa-CarShowroom', 'Mumabi Boriwali Branch'),(04, 'Horoa-CarShowroom', 'Noyda MG-Road Branch'),(05, 'Audi-CarShowroom', 'Banglore Vijayanagar Branch')");
		
//		st.execute("insert into showrooms (id, name, branch) values (06, 'BMW-CarShowroom', 'Goa Beach Branch')");
//		System.out.println("data inserted");
		
		ResultSet ss = st.executeQuery("select * from showrooms");
		System.out.println("All ShowRooms Details");
		System.out.print("id" + "   Showroom Name " + "      "+"Branch ");
		System.out.println();
		while(ss.next()) {
			
			System.out.print(ss.getInt(1)+"  | ");
			System.out.print(ss.getString(2)+" ");
			System.out.print("| "+ss.getString(3)+" ");
			System.out.println();
		}
		
		
		
		}		
		catch (ClassNotFoundException c) {
			
		} catch (SQLException e) {
			
		}
	}
}
