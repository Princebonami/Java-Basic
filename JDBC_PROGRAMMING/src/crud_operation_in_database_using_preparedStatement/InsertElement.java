package crud_operation_in_database_using_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertElement {

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
			System.out.println("Enter the number of Employee details we want to enter :");
			Scanner scanner=new Scanner(System.in);
			int num=scanner.nextInt();
			scanner.nextLine();
			
			for(int i=0;i<num;i++)
			{
				System.out.println("Enter the name of the employee :");
				String name=scanner.nextLine();
				System.out.println("Enter the slary of the employee :");
				int sal=scanner.nextInt();
				scanner.nextLine();
				String insertQuery="insert into Employee(empName,empSal) values(?,?)";
				PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
				
				preparedStatement.setString(1, name);
				preparedStatement.setInt(2,sal);
				
				preparedStatement.execute();
				
				System.out.println("===================================================");
				
			}
			System.out.println("THe data gets inserted successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("THe data not inserted successfully");
		}

	}

}
