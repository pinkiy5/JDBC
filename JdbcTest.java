package default_package;

import java.sql.*;
public class JdbcTest {

	public static void main(String[] args) {
		try {
			//register driver step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//get connection step 2
			Connection conn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/student","root","root");
			
			//create statement step 3
			Statement stmt=conn.createStatement();
			
			//execute query fetch data from database step 4
			ResultSet rs=stmt.executeQuery("Select*from future_emp");
			
			//iteration
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getFloat(6));
			}
			//close database connection step 5
			conn.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
