package Scoping_of_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Scoping_of_beans/stconfig.xml");
		Address address=context.getBean("address",Address.class);
		context.re
		System.out.println(address.hashCode());
		Address address1=context.getBean("address",Address.class);
		System.out.println(address1.hashCode());
		System.out.println("=============================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);

	}

}
