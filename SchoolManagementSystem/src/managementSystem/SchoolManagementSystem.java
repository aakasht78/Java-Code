package managementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SchoolManagementSystem {
	static int a;
	static{	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementSystem", "root", "root");
			PreparedStatement ps = con.prepareStatement("select id from school");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				a=rs.getInt(1);
			}
			
		} catch (ClassNotFoundException | SQLException e) {		}
		
	}		
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementSystem", "root", "root");
			System.out.println("connection established");
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			
//			st.execute("Create database schoolmanagementSystem");
//			System.out.println("database created");
			
//			st.execute("create table School(id int, name varchar(100), rollno int, std int) ");
//			System.out.println("table created ");
			
			
			System.out.println("Welcome to School Management System..");
			
			System.out.println(" 1. login for admin \n 2. login for student");
			int log = sc.nextInt();
			
			switch (log) {
			case 1:
			{
				
		
				System.out.println("1. Insert Data 2. Update Data 3. Delete Data 4. Fetch Data By ID");
				int wh = sc.nextInt();
				
				switch (wh) {
				case 1://=======================Insert Data=======================
				{
				
				PreparedStatement ps = con.prepareStatement("insert into school(id, name, rollno, std) values (?,?,?,?)");
				
					System.out.println("Please Enter The id");
					int id = sc.nextInt();
					
					System.out.println("Please Enter The Name");
					String nam = sc.next();
					
					System.out.println("Please Enter The rollno");
					int rollno = sc.nextInt();
					
					System.out.println("Please Enter The std");
					int std = sc.nextInt();
					
					ps.setInt(1, id);
					ps.setString(2, nam);
					ps.setInt(3, rollno);
					ps.setInt(4, std);
				
					ps.execute();
					
					System.out.println("Data Inserted");
				
					break;
				}
				case 2://=======================Update Data=======================
				{
                    System.out.println("Which Data You Want To Update? \n 1.Name 2.rollno 3.std");
                    int which = sc.nextInt();
                    
                    switch (which) {
                    case 1:// ======================Name Update =====================
                    {
                    	PreparedStatement ps = con.prepareStatement("Update school set name = ? where id = ?");
                    	System.out.println("Please Enter The New Name");
                    	String name = sc.next();
                    	
                    	System.out.println("Please Enter The Id To Update ");
                    	int id = sc.nextInt();
                    	
                    	ps.setString(1, name);
                    	ps.setInt(2, id);
                    	
                    	ps.execute();
                    	
                    	System.out.println("Name Updated");
                    	break;
                    }
                    case 2:// ===================== Rollno Update =====================
                    {
                    	PreparedStatement ps = con.prepareStatement("Update school set rollno = ? where id = ?");
                    	System.out.println("Please Enter The New Rollno");
                    	int rollno = sc.nextInt();
                    	
                    	System.out.println("Please Enter The Id To Update ");
                    	int id = sc.nextInt();
                    	
                    	ps.setInt(1, rollno);
                    	ps.setInt(2, id);
                    	
                    	ps.execute();
                    	
                    	System.out.println("Roll Number Updated");
                    	break;
                    }
					case 3://====================== STD Update ========================
					{
						PreparedStatement ps = con.prepareStatement("Update school set std = ? where id = ?");
						System.out.println("Please Enter The New std");
                    	int std = sc.nextInt();
                    	
                    	System.out.println("Please Enter The Id To Update ");
                    	int id = sc.nextInt();
                    	
                    	ps.setInt(1, std);
                    	ps.setInt(2, id);
                    	
                    	ps.execute();
                    	
                    	System.out.println("Standard Updated");
						break;
					}
					default:
					{
						System.out.println("Invalid....");
						break;
					}
						
                    }
					break;
				}
				case 3://=======================Delete Data=======================
				{
				PreparedStatement ps = con.prepareStatement("Delete from school where id = ? ");
				System.out.println("Please Enter The Id To Delete");
				int id = sc.nextInt();
				ps.setInt(1, id);
				ps.execute();
				System.out.println("Data Deleted...");
					break;
				}
				case 4://=======================Fetch  Data=======================
				{
					PreparedStatement ps = con.prepareStatement("Select * from school where id = ?");
					System.out.println("Please Enter The Id To See The Data");
					int id = sc.nextInt();
					
					if(a==id) {
					ps.setInt(1, id);
				ResultSet	rs = ps.executeQuery();
				System.out.println("ID    Name    Rollno Std  ");
					while(rs.next()) {
						System.out.print(" "+rs.getInt(1)+" ");
						System.out.print("  "+rs.getString(2)+" ");
						System.out.print("    "+rs.getInt(3)+" ");
						System.out.print("    "+rs.getInt(4)+" ");
						
						
						System.out.println();
					}
					}else {
						System.out.println("NO DATA FOUND");
					}
					break;
					}
				
				default:{
					System.out.println("Invalid....");
					break;
				}
					
				}
				break;
			}
			case 2:
			{
				System.out.println("Welcome To Student Dashbord");
				
				PreparedStatement ps = con.prepareStatement("Select * from school where id = ?");
				System.out.println("Please Enter Your Id To See The Data");
				int id = sc.nextInt();
				
				if(a==id) {
				ps.setInt(1, id);
			ResultSet	rs = ps.executeQuery();
			System.out.println("ID    Name    Rollno Std  ");
				while(rs.next()) {
					System.out.print(" "+rs.getInt(1)+" ");
					System.out.print("  "+rs.getString(2)+" ");
					System.out.print("    "+rs.getInt(3)+" ");
					System.out.print("    "+rs.getInt(4)+" ");
					
					
					System.out.println();
				}
				}
				else {
					System.out.println("No Data Found");
					
				}
				break;
			}
			default:
				System.out.println("invalid...!!!");
				break;
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
		}
	}
}
