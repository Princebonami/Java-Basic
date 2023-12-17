package crud_operation_by_using_Statement_Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertElement {
	public static void main(String[] args) {
		String name = "";
		String address = "";
		Scanner scanner = new Scanner(System.in);
		

		try {
			// load driver

			Class.forName("com.mysql.cj.jdbc.Driver");

			// create/establish connection
			String url = "jdbc:mysql://localhost:3306/Details";
			String userName = "root";
			String password = "root";

			Connection connection = DriverManager.getConnection(url, userName, password);

			// create statement

			Statement statement = connection.createStatement();
//			System.out.println(stuName);
//			System.out.println(stuAddress);
			
			System.out.println("Enter the number of student details you want to enter :");
			int num = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the students details:");
			System.out.println("===================================================");
			for (int i = 0; i < num; i++) {
				System.out.println("Enter the name of the student :");
				
				name = scanner.nextLine();
				System.out.println("Enter the Address of students :");
				address = scanner.nextLine();
				
				String insertQuery = "insert into Student(stuName,stuAddress) values('%s','%s')";
				// this format() method of string class is used to concatenate string with some values
				insertQuery = String.format(insertQuery, name, address);
				
//				String insertQuery="insert into Student(stuName,stuAddress) values(name,address)";

				statement.executeUpdate(insertQuery);
				System.out.println("===============================================");
			}

			

			System.out.println("The details are inserted successfully");

			connection.close();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

			System.out.println("The details are not inserted successfully");
		}

	}

}
