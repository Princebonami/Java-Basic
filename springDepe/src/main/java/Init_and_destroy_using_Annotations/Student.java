package Init_and_destroy_using_Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	
	private int id;
	private String name;
	
	private Address address;
	
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("It act as an init method of student class");
	}
	@PreDestroy
	public void stop()
	{
		System.out.println("It act as an destroy method of student class");
	}

}
