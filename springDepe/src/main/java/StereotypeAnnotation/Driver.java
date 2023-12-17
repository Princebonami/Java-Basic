package StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("StereotypeAnnotation/stconfig.xml");
		Address address=context.getBean("ob",Address.class);
		System.out.println(address);
		System.out.println("===========================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);

	}

}
