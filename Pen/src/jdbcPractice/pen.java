package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pen {
	public static void main(String[] args) {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcPractice", "root", "root");

			Statement st = con.createStatement();
			
			//CREATE TABLE
			
//			st.execute("create table Pen (id int , brand varchar(50), price double)");
//			System.out.println("table created ");
//			
			
			//INSERT DATA
//			st.execute("insert into pen(id, brand, price) values (01,'celo', 20.00), (02,'classmate', 15.00), (03,'natraj', 6.00)");
//			System.out.println("data inserted");
			
			//DELETE DATA
//			st.execute("delete from pen where id = '03' ");
//			System.out.println("data deleted");
			
			//UPDATE DATA
			st.execute("update pen set id = '07' where brand = 'celo'");
			System.out.println("data updated");
			
			
			//READ DATA
			ResultSet s=st.executeQuery("select * from pen");
			while(s.next()) {
				System.out.print(s.getInt(1) + " ");
				System.out.print(s.getString(2) + " ");
				System.out.print(s.getDouble(3) + " ");
				System.out.println();
			}
			
			
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			
		}
	}
}
