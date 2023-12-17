package Autowiring_using_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private int id;
	private String name;
	@Autowired
	private Address address;
	
	
	public Student() {
		super();
	}
	
	
	
//	public Student(int id, String name, Address address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Setter id is calling");
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
		return "id=" + id + ", name=" + name + ", address=[" + address+ "]";
	}	

}
