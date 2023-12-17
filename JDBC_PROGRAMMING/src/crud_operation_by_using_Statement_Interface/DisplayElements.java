package crud_operation_by_using_Statement_Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayElements {

	public static void main(String[] args) {
		
		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create/establish connection
			
			String url="jdbc:mysql://localhost:3306/Details";
			String user="root";
			String password="root";
			Connection connection=DriverManager.getConnection(url,user,password);
			
			// create statement
			
			Statement statement=connection.createStatement();
			
			//execute query
			
			String displayQuery="select * from Student";
			ResultSet resultSet=statement.executeQuery(displayQuery);
			
			while(resultSet.next())
			{
				int id=resultSet.getInt("stuId");
				String name=resultSet.getString("stuName");
				String address=resultSet.getString("stuAddress");
				
				System.out.println(id+" "+name+" "+address);
			}
			
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
