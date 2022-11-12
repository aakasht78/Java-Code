package Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Book {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcPractice", "root", "root");
			
			Statement st = con.createStatement();
			
			//CREATE TABLE
//			st.execute("create table Book (id int , brand varchar(50), noOfPages int, price int)");
//			System.out.println("table created ");
			
			//INSERT DATA
//			st.execute("insert into book(id, brand, noOfPages ,price) values (01,'apsara', 100,55), (02,'classmate', 200,150), (03,'natraj', 150,60)");
//			System.out.println("data inserted");
//			
//			
			//DELETE DATA
//			st.execute("delete from book where brand = 'apsara' ");
//			System.out.println("data deleted");

			
			//UPDATE DATA
			st.execute("update book set price = '55' where brand = 'apsara'");
			System.out.println("data updated");
			
			//READ DATA
			ResultSet s=st.executeQuery("select * from book");
			while(s.next()) {
				System.out.print(s.getInt(1) + " ");
				System.out.print(s.getString(2) + " ");
				System.out.print(s.getInt(3) + " ");
				System.out.print(s.getInt(4) + " ");
				System.out.println();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
