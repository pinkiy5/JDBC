package default_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

 class Inserting_data_Using_Scanner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//user input
	System.out.println("enter the emp_id: "); //employee_ID
	String emp_id=sc.next();
	System.out.println("enter ename: ");  //Employee name
	String ename=sc.next();
    System.out.println("enter Designation: ");// emp designation
    String designation=sc.next();
    System.out.println("enter dept: ");  //employee dept
    String dept=sc.next();
    System.out.println("enter working_hours: "); //working hours
    String working_hour=sc.next();
    System.out.println("enter salary: ");  //salary
    String salary=sc.next();

    try {
    	Class.forName("com.mysql.cj.jdbc.Driver");//step no 1 register driver
    	//step 2 getting the connection
		Connection conn=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/student","root","root"); //build connection step 2
		//creating statement---user input using prepared statement
		PreparedStatement stm;
		//inserting data in database table
		String sql="insert into future_emp values(?,?,?,?,?,?)"; //no of columns
		stm=conn.prepareStatement(sql);
		stm.setString(1, emp_id);
		stm.setString(2, ename);
		stm.setString(3, designation);
		stm.setString(4,dept);
		stm.setString(5,working_hour);
		stm.setString(6,salary);
		stm.execute();
		System.out.println("inserted successfully");
		}
    catch(Exception e) {
    	System.out.println(e);
    }

}}

