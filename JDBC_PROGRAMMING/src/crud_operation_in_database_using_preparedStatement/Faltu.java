package crud_operation_in_database_using_preparedStatement;

import java.util.HashMap;
import java.util.Map;

public class Faltu {

	public static void main(String[] args) {
		Map<Employee, String> m1=new HashMap<Employee,String>();
		Employee e1=new Employee(101,"prince");
		Employee e2=new Employee(102,"piyush");

		Employee e3=new Employee(103,"manoj");

		Employee e4=new Employee(104,"deva");
		
		m1.put(e1,"Dev");


	}

}
