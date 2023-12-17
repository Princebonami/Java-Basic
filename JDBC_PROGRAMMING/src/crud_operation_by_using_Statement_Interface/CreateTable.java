package crud_operation_by_using_Statement_Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		// here we have to create a table in database Student
		
		try {
			// it is used to load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create Statement/establish connection
			
			String url="jdbc:mysql://localhost:3306/Details";
			String userName="root";
			String password="root";
			
		    Connection connection=DriverManager.getConnection(url, userName, password);
		   
		    // create statement
		    
		    Statement statement=connection.createStatement();
		    
		    // execute query
		    
		    String query="create table Student(stuId int(10) primary key auto_increment,stuName varchar(20) not null,stuAddress varchar(20) not null)";
		    
		    statement.execute(query);
		    
		    System.out.println("The table is created sucessfully");
		    
		    // close connection
		    
		    connection.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Table not created succesfully");
		}

	}

}
