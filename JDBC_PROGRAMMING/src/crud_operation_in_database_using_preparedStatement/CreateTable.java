package crud_operation_in_database_using_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) {

	//	 here we have to create the table by using prepare statement interface.
		
		try {
			// load driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create/establish connection
			
			String url="jdbc:mysql://localhost:3306/Details";
			String user="root";
			String password="root";
			
			Connection connection=DriverManager.getConnection(url, user, password);
			
			//create statement
			
			String createQuery="create table Employee(empId int(20) primary Key auto_increment, empName varchar(20) not null,empSal int(20) not null)";
			PreparedStatement preparedStatement=connection.prepareStatement(createQuery);
			
			preparedStatement.execute();
			
			System.out.println("The table is created successfully ");
			
		connection.close();

	} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		System.out.println("The table is not created successfully");
	}

		

	}

}
