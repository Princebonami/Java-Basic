package INit_and_Destroy_Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("INit_and_Destroy_Method/config.xml");
		Address address=(Address)context.getBean("address");
		context.registerShutdownHook();
		System.out.println(address);
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
		Student student=(Student)context.getBean("student");
		System.out.println(student);
		

	}

}
