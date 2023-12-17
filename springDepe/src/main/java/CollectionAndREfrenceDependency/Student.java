package CollectionAndREfrenceDependency;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	private List<String> courses;
	private Set<String> hobbies;
	private Map<Integer,String> games;
	private Properties prop;
	
	public Student() {
		super();
	}

	

	public Student(int id, String name, Address address, List<String> courses, Set<String> hobbies,
			Map<Integer, String> games, Properties prop) {
		System.out.println("Constructor of student");
		this.id = id;
		this.name = name;
		this.address = address;
		this.courses = courses;
		this.hobbies = hobbies;
		this.games = games;
		this.prop = prop;
	}



	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address + ", courses=" + courses + ", hobbies="
				+ hobbies + ", games=" + games + ", prop=" + prop;
	}



	
	
	
	
	

}
