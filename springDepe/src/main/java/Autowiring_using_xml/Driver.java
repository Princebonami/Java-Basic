package Autowiring_using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Autowiring_using_xml/auconfig.xml");
		Address address=context.getBean(Address.class);
		System.out.println(address);
		
		System.out.println("=========================================================");
		
		Student student=context.getBean(Student.class);
		System.out.println(student);

	}

}
