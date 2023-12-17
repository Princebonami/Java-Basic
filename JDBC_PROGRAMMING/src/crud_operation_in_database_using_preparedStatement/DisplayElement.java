package crud_operation_in_database_using_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayElement {

	public static void main(String[] args) {
		
		
		try {
			
			// load Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create/establish connection
			
			String url="jdbc:mysql://localhost:3306/Details";
			String user="root";
			String password="root";
			
			Connection connection=DriverManager.getConnection(url, user, password);
			
			// create statement
			 Scanner scanner=new Scanner(System.in);
			 System.out.println("Press 1=============for all employee information ");
			 System.out.println("Press 2=============for particular employee information");
			 
			 int num=scanner.nextInt();
			 
			 switch (num) {
			case  1:
			{
				String displayQuery="select * from Employee";
				PreparedStatement preparedStatement=connection.prepareStatement(displayQuery);
				ResultSet resultSet=preparedStatement.executeQuery();
				while(resultSet.next())
				{
					int id=resultSet.getInt("empId");
					String name=resultSet.getString("empName");
					int sal=resultSet.getInt("empSal");
					
					System.out.println(id+" "+name+" "+sal);
				}
			}
              break;
              
			case 2:
			{
				System.out.println("Enter the id of the employee :");
				int id=scanner.nextInt();
				String displayQuery="select * from Employee where empId=?";
				PreparedStatement preparedStatement=connection.prepareStatement(displayQuery);
				preparedStatement.setInt(1,id);
				ResultSet resultSet=preparedStatement.executeQuery();
				while(resultSet.next())
				{
					int id1=resultSet.getInt("empId");
					String name=resultSet.getString("empName");
					int sal=resultSet.getInt("empSal");
					
					System.out.println(id1+" "+name+" "+sal);
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
