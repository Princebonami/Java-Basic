package Scoping_of_beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

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
    @pre
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
		return "id=" + id + ", name=" + name + ", address= [" + address+"]";
	}	

}
