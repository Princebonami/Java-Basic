package INit_and_Destroy_Method;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private List<String> courses;
	private Address address;
	
	public Student() {
		super();
	}


	public Student(int id, String name, List<String> courses, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.address = address;
		
		
	}
	
     public void init()
     {
    	 System.out.println("Database connection gets established in student class");
    	 System.out.println("Web services connections gets established in student class");
     }


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + ", address=" + address + "]";
	}
	
	public void destroy()
	{
		System.out.println("All databse connection gets detached in student class");
		System.out.println("All web services connections gets detached in student class");
	}
	
	
	

}
