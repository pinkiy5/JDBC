package default_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Insertjdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //register driver set-up 1
			//connection diver manager
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");//step 2
			Statement stmt = conn.createStatement();//step 3
			//inserting data into database tables//step 4
			stmt.executeUpdate("insert into Studentdemo values(10, 'nisha','opt_mgr','com','kolkata',12,20000),(11,'priya','admin','it','delhi',12,15000)");
			System.out.println("inserted successfully");
			conn.close();//step 5
		}catch (Exception e) {
			System.out.println(e);
			
		}
	}

}

//      use jdbcdb;
//      create table studentdemo(emp_id int, ename varchar(20), designation varchar(25), 
//	    dept varchar(20), address varchar(20), 
//      working_hours int, salary double(10,2));
