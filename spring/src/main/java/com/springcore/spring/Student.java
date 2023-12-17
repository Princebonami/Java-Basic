package com.springcore.spring;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	public int getStudentId() {
		
		return studentId;
	}
	public void setStudentId(int studentId) {
		
		System.out.println("Getting studentId");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		
		System.out.println("Setting studentId");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		
		System.out.println("Setting studentId");
		this.studentAddress = studentAddress;
	}
	
	public Student() {
		super();
	}
	
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
