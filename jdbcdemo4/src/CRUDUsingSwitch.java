import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDUsingSwitch {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
			
			
			Statement st = con.createStatement();
//			st.execute("create database emp");
//			System.out.println("database created");
//			st.execute("create table employee1 (id int , name varchar(50), salary double");
			
//			System.out.println("table created");
			

			System.out.println("1. Insert 2. Update 3. Delte 4. Get Data By Id");
			int choice = sc.nextInt();
		
			
			switch (choice) {
			case 1:{//================INSERT-DATA =====================
				PreparedStatement ps = con.prepareStatement("insert into employee(id , name, salary ,experience) values (?,?,?,?)");
				System.out.println("Enter The Id");
				int id = sc.nextInt();
				
				System.out.println("Enter The Name");
				String name = sc.next();
				
				System.out.println("Enter The Salary");
				double sal = sc.nextDouble();
				
				System.out.println("Enter The Experience");
				int exp = sc.nextInt();
				
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setDouble(3, sal);
				ps.setInt(4, exp);
				
				ps.execute();
				System.out.println("Data Inserted");
								
				break;
			}
			
			case 2:{//================UPDATE-DATA =====================
				PreparedStatement pj = con.prepareStatement("update employee set salary=? where name=? ");
				
				System.out.println("Enter new salary :- ");
				double sal = sc.nextDouble();
				
				System.out.println("to whome ? please enter the Name ");
				String nam2 = sc.next();
				
				pj.setDouble(1, sal);
				pj.setString(2, nam2);
				
				pj.execute();
				System.out.println("Data Updated");
				break;
			}
			
			case 3:{//================DELETE-DATA =====================
				
				PreparedStatement pj = con.prepareStatement("delete from employee where name = ? ");
				System.out.println("want to delete any data? enter the name");
				String name = sc.next();
				pj.setString(1, name);
				pj.execute();
				System.out.println("data deleted");
				
				break;
			}
			
			case 4:{//================FETCH-DATA =====================
				PreparedStatement ps = con.prepareStatement("Select * from employee where id = ?");
				System.out.println("Enter the id");
				int id = sc.nextInt();
				
				ps.setInt(1, id);
				
				ResultSet ss = ps.executeQuery();
				while(ss.next()) {
					System.out.print(ss.getInt(1)+" ");
					System.out.print(ss.getString(2)+" ");
					System.out.print(ss.getDouble(3)+" ");
					System.out.print(ss.getInt(4)+" ");
					System.out.println();
				}
				
				break;
			}
			
			default:{
				System.out.println("Invalid data");
				break;
			}
				
			}
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			
		}

		

		
	}
}
