package executeMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			System.out.println("connection established");
				
			Statement st = con.createStatement();

//			st.execute("create table emp (id int , name varchar(50), salary double) ");
			
//			 boolean b = st.execute("insert into emp(id,name,salary)values(01,'aakash',2000));
//			System.out.println(b);
			
			//INSERT TABLE
//			int a = st.executeUpdate("insert into emp(id,name,salary)values(02,'vishal',5000), (03,'pritam',3000), (04,'aniket', 10)");
//		    System.out.println(a);

		    //  DELETE TABLE
//			st.execute("delete from emp where id = 01");
//			System.out.println("data deleted");
			
		    
//			st.execute("delete from emp where name = 'aniket'");
//			System.out.println("data deleted");
			
		    
		   // UPDATE TABLE
//			boolean b  = st.execute("update emp set id='02' where name = 'aakash'");
//			System.out.println(b);
		    
			//FETCH THE DATA
			
			ResultSet rs = st.executeQuery("select * from emp");	
			while(rs.next()) {
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getDouble(3) + " ");
				System.out.println();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
	}
}
