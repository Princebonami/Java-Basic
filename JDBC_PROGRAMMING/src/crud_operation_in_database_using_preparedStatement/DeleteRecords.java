package crud_operation_in_database_using_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecords {

	public static void main(String[] args) {
		
		try {
			// load driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create/establish connection
			
			String url="jdbc:mysql://localhost:3306/Details";
			String user="root";
			String password="root";
			
			Connection connection=DriverManager.getConnection(url, user, password);
			
			// create statement
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the id which you want to delete :");
			int id=scanner.nextInt();
			
			String deleteQuery="delete from Employee where empId=?";
			PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);
			preparedStatement.setInt(1, id);
            int i= preparedStatement.executeUpdate();
            if(i==1)
            {
            	System.out.println("The deletion occur sucessfully");
            }
            else 
            	{
            		System.out.println("The deletion not occur sucessfully");
            	}
			
            connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
