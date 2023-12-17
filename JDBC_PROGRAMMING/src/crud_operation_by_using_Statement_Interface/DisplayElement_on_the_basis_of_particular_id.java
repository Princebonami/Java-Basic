package crud_operation_by_using_Statement_Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DisplayElement_on_the_basis_of_particular_id {

	public static void main(String[] args) {
	  
	   try {
		   //load driver
		   
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    
		   // create/establish connection
		    
		    String url="jdbc:mysql://localhost:3306/Details";
		    String user="root";
		    String password="root";
		    
		    Connection connection=DriverManager.getConnection(url, user, password);
		    
		    // create statement
		    
		    Statement statement=connection.createStatement();
		    
		    //execute query
		    System.out.println("Enter the student id which you want to print :");
		    Scanner scanner=new Scanner(System.in);
		    int id=scanner.nextInt();
		    
		    String displaQuery="select * from Student where stuId=%d";
		    String query=String.format(displaQuery,id);
		    
		    ResultSet resultSet=statement.executeQuery(query);
		    
		    while(resultSet.next())
		    {
		    	int stuId=resultSet.getInt("stuId");
		    	String name=resultSet.getString("stuName");
		    	String address=resultSet.getString("stuAddress");
		    	
		    	System.out.println(stuId+" "+name+" "+address);
		    	
		    }
		    connection.close();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   

	}

}
