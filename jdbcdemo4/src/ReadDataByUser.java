
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadDataByUser {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "root");
			System.out.println("We Are Ready To Go");
			Scanner sc= new Scanner(System.in);
			
//			=============================-INSERT DATA -=====================================================
			System.out.println("Want to insert data Y/N");
			String ind = sc.next();
			
			switch (ind) {
			case "y":{
				PreparedStatement pq = con.prepareStatement("insert into india (name,age,capno,state) values (?,?,?,?) ");
				
				System.out.println("please enter the name");
				String name1 = sc.next();
				
				System.out.println("please enter the age");
				int age1 = sc.nextInt();
				
				System.out.println("please enter the capno");
				int capno1 = sc.nextInt();
				
				System.out.println("please enter the state");
				String state1 = sc.next();
				
				pq.setString(1, name1);
				pq.setInt(2, age1);
				pq.setInt(3, capno1);
				pq.setString(4, state1);
				
				pq.execute();
				System.out.println("data inserted");
				break;
			}
			case "n":{
				System.out.println("ok");
				break;
			}
			default:{
				System.out.println("invalid!!");
				break;
			}
			
			}
		
			
			
//			=====================================-Fetch-===================================================
			
			System.out.println("Want To Find Someone? Y/N");
			String FS = sc.next();
			
			switch (FS) {
			case "y":{
				System.out.println("Enter The cap number");
				int capno = sc.nextInt();		
			
				PreparedStatement ps = con.prepareStatement("select * from india where capno=? ");
				
				ps.setInt(1, capno);
				
				ResultSet rs = ps.executeQuery();
				

				while(rs.next()) {
					System.out.print(rs.getString(1)+" ");
					System.out.print(rs.getInt(2)+" ");
					System.out.print(rs.getString(3)+" ");
					System.out.print(rs.getString(4)+" ");
					System.out.println();
				}	
				
				break;

			}
				case "n":{
					System.out.println("okk");
					break;
				}	
			default:{
				System.out.println("Please enter valid data");
				break;				
			}
		}
						
			//==========================-Update Query-============================
			System.out.println("Want to update any capno? Y/N");
			String anupdate = sc.next();
			
			switch (anupdate) {
			case "y":
			{
				PreparedStatement pj = con.prepareStatement("update india set capno=? where name=? ");
				
				System.out.println("Enter new capno :- ");
				int capup = sc.nextInt();
				
				System.out.println("to whome ? please enter the Name ");
				String nam1 = sc.next();
				
				pj.setInt(1, capup);
				pj.setString(2, nam1);
				
				pj.execute();
				System.out.println("Data Updated");
				break;
			}
			case "n" : {
				System.out.println("Ok");
				break;
			}
			default:
				System.out.println("please enter the valid data");
				break;
			}
			
			
			
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			
		}
	}
}