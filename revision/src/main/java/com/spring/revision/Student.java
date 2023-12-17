package com.spring.revision;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean ,DisposableBean{
	
	private String id;
	private String name;
	
	public Student() {
		super();
	}
	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

    @Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("it act as init method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("It act as destroy() method");
		
	}
    
	
	
	
	
	
	
	
	
	
	

}
