package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Hospital {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcPractice", "root", "root");
			System.out.println("connection establised");
			
			Statement st = con.createStatement();
			
			
			// CREATE DATABASE
//			st.execute("create database jdbcPractice");
//			System.out.println("database created successfully");
			
			// CREATE TABLE
//			st.execute("create table Hospital(id int , name varchar(100), address varchar(250))");
//			System.out.println("table created successfully");
			
			
			//INSERTED DATA
//			st.execute("insert into Hospital(id, name, address) values (01,'aakash', 'pune')");
			
//			st.execute("insert into Hospital(id, name, address) values (02,'aniket', 'pune deccan'), (03,'pritam','pune dhayri'), (04, 'vishal','pune swargate')");
			System.out.println("data inserted");
			
			//DELETED DATA
//			st.execute("delete from Hospital where name = 'aakash' ");
//			System.out.println("data deleted");
//			
//			
			//UPDATE DATA
			st.execute("update Hospital set name = 'aakash' where name = 'aniket'");
			System.out.println("data updated");

			
			// READ DATA
			System.out.println();
			ResultSet s=st.executeQuery("select * from Hospital");
			while(s.next()) {
				System.out.print(s.getInt(1) + " ");
				System.out.print(s.getString(2) + " ");
				System.out.print(s.getString(3) + " ");
				System.out.println();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
