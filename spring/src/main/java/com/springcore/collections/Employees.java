package com.springcore.collections;

import java.util.*;

public class Employees {
	
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> courses;
	private Properties pros;
	
	
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	

	
	public Employees(String name, List<String> phones, Set<String> address, Map<String, String> courses,
			Properties pros) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.pros = pros;
	}
	public Employees() {
		super();
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses
				+ ", pros=" + pros + "]";
	}
	
	
	
	
	
	
	
	
	
	

}