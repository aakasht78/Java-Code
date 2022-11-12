package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class manager {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcPractice", "root", "root");
			
			Statement st = con.createStatement();
			
			//CREATE TABLE
//			st.execute("create table manager (id int , name varchar(50), yearsofexperience int, salary double)");
//			System.out.println("table created ");
//			
			
			//INSERT DATA
//			st.execute("insert into manager(id, name, yearsofexperience ,salary) values (01,'aakash', 2, 30000.00), (02,'aniket', 3 ,35000.00), (03,'vishal', 15,60000.00)");
//			System.out.println("data inserted");
//			
			
			//DELETE DATA
//			st.execute("delete from manager where name = 'aakash' ");
//			System.out.println("data deleted");
//			

			//UPDATE DATA
			st.execute("update manager set name = 'rahul' where name = 'aniket'");
			System.out.println("data updated");

			
			//READ DATA
			ResultSet s=st.executeQuery("select * from manager");
			while(s.next()) {
				System.out.print(s.getInt(1) + " ");
				System.out.print(s.getString(2) + " ");
				System.out.print(s.getInt(3) + " ");
				System.out.print(s.getDouble(4) + " ");
				System.out.println();
			}
			
			
		} catch (ClassNotFoundException e) {
			
		}
		
		catch (SQLException e) {
			
		}
	}
}
