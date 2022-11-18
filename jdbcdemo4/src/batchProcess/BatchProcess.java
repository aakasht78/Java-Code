package batchProcess;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcess {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementSystem", "root", "root");
			System.out.println("connection established");
			
			Statement st = con.createStatement();
			
			st.addBatch("insert into school (id,name,rollno,std) values (11,'Tejus',11,9)");
			st.addBatch("insert into school (id,name,rollno,std) values (12,'Ravi',12,9)");
			st.addBatch("insert into school (id,name,rollno,std) values (13,'Neha',13,9)");
			st.addBatch("insert into school (id,name,rollno,std) values (14,'Vara Prasad',14,9)");
			st.addBatch("insert into school (id,name,rollno,std) values (15,'Mohan',15,9)");
						
			st.executeBatch();
			        
			System.out.println("data inserted");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}