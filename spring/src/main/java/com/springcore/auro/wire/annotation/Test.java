package com.springcore.auro.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auro/wire/annotation/auto1config.xml");
		Emp employee=context.getBean("emp",Emp.class);
		System.out.println(employee);
		
		

	}

}
  