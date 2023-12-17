package StereotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("1")
	private int id;
	@Value("Prince kumar")
	private String name;
	@Autowired
	private Address address;
	@Value("#{temp}")
	private List<String> courses;
	
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address + ", courses=" + courses;
	}

	

}
