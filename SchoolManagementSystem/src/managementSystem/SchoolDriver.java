package managementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SchoolDriver {
	public static void main(String[] args) {
		SchoolBluePrint b= new SchoolBluePrint();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementSystem", "root", "root");
			System.out.println("connection established");
//			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);

			//============================= ADMIN OR STUDENT LOGIN ===================== 			
			
			System.out.println("Welcome to School Management System..");
			
			System.out.println(" 1. login for admin \n 2. login for student");
			int log = sc.nextInt();
			
			switch (log) {
			case 1:{
			
				
				break;
			}
			case 2:{ 
				
				break;
			}
			default:
				break;
			}
			
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
