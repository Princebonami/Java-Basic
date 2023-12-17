package crud_operation_in_database_using_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateElement {

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
			
			System.out.println("press 1================to update name");
			System.out.println("press 2================to update salary");
			Scanner scanner=new Scanner(System.in);
			
			int num=scanner.nextInt();
			
			switch (num) {
			case 1:
			{
				System.out.println("Enter the id which you want to update :");
				Integer id=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter the updated name :");
				String name=scanner.nextLine();
				String updateQuery="update Employee set empName=? where empId=?";
				PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
				preparedStatement.setString(1, name);
				preparedStatement.setInt(2, id);
				
				int i=preparedStatement.executeUpdate();
				
				if(i==1)
				{
					System.out.println("The name is updated sucessfully");
				}
				else {
					System.out.println("The name is not updated sucessfully");
				}
				break;
			}
			case 2:
			{
				System.out.println("Enter the id which you want to update :");
				Integer id=scanner.nextInt();
				System.out.println("Enter the updated salary :");
				int sal=scanner.nextInt();
				String updateQuery="update Employee set empSal=? where empId=?";
				PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
				preparedStatement.setInt(1, sal);
				preparedStatement.setInt(2, id);
				
				int i=preparedStatement.executeUpdate();
				
				if(i==1)
				{
					System.out.println("The salary is updated sucessfully");
				}
				else {
					System.out.println("The salary is not updated sucessfully");
				}
				break;
			}
		}
			connection.close();	
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
