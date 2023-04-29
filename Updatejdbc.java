package default_package;

import java.sql.*;
import java.sql.DriverManager;

public class Updatejdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
			Statement stmt= conn.createStatement();
			//updating an exciting record
     		stmt.executeUpdate
			("Update studentdemo set ename='Raj' where emp_id = 10");
			
			//delete
			stmt.executeUpdate
			("delete from studentdemo where emp_id=11");
			
			//execute query fetching data from database
			ResultSet rs=stmt.executeQuery("Select* from studentdemo");
			
			//iteration
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getInt(7));
			}
			
			//close database connection step 5
			conn.close();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

