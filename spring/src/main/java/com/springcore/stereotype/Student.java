package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	@Value("Prince Kumar")
	private String studentName;
	@Value("Barauni")
	private String city;
	
	@Autowired
	private Address address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student() {
		super();
	}
	
	
	public Student(String studentName, String city, Address address) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}
	
	 
	

}
