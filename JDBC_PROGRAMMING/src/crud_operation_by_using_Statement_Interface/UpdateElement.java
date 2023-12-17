package crud_operation_by_using_Statement_Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class UpdateElement {

	public static void main(String[] args) {
		
		try {
			
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create/establish connection
			
			String url="jdbc:mysql://localhost:3306/Details";
			String user="root";
			String password="root";
			
			Connection connection=DriverManager.getConnection(url, user, password);
			
			// create statement
			
		    Statement statement=connection.createStatement();
		    
		    //Execute query
		    Scanner scanner=new Scanner(System.in);
		    System.out.println("Enter the id of student you want to update :");
		    int id=scanner.nextInt();
		    System.out.println("Press 1 =========== to update Name");
		    System.out.println("Press 2 =========== to update Address");
		    
		    int op=scanner.nextInt();
		    scanner.nextLine();
		    switch (op) {
		    
			case 1: {
				System.out.println("Enter the updated name :");
				String name=scanner.nextLine();
				String updatedQuery="update Student set stuName='%s' where stuId=%d";
				String query=String.format(updatedQuery,name,id);
				int i=statement.executeUpdate(query);
				if(i==1)
				{
					System.out.println("The name of student gets updated");
				}
				else {
					System.out.println("The name not updated");
				}
			break;	
			}
			
			case 2:
			{
				System.out.println("Enter the updated address :");
				String address=scanner.nextLine();
				String updatedQuery="update Student set stuAddress='%s' where stuId=%d";
				String query=String.format(updatedQuery,address,id);
				int i=statement.executeUpdate(query);
				if(i==1)
				{
					System.out.println("The address of student gets updated");
				}
				else {
					System.out.println("The address not updated");
				}
			}
				
				
			}
		    connection.close();
		   
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
