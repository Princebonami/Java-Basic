package com.springcore.revision1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/revision1/stuConfig.xml");
		
		
		
        Address address=(Address)context.getBean("address");
		
		System.out.println(address);
		
		System.out.println("====================================================");
		
		
		Student stu=(Student)context.getBean("student");
		System.out.println(stu);
		
		
		
		

	}

}
