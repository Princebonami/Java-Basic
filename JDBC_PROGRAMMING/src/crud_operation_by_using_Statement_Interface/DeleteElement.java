package crud_operation_by_using_Statement_Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
import com.mysql.jdbc.Driver;



public class DeleteElement {

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
			System.out.println("Enter the id which you want to delete :");
			Scanner scanner=new Scanner(System.in);
			int id=scanner.nextInt();
			String deleteQuery="delete from Student where stuId=%d";
			String query=String.format(deleteQuery, id);
			
			int i=statement.executeUpdate(query);
			if(i==1)
			{
				System.out.println("The deletion of records successfully");
			}
			else {
				System.out.println("THe deletion of records not successfully");
			}
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
