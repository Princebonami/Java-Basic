package Init_and_Destroy_Method_using_Interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Init_and_Destroy_Method_using_Interfaces/inconfig.xml");
		context.registerShutdownHook();
		Address address=(Address)context.getBean("address");
		System.out.println(address);
		
		System.out.println("==============================================");
		Student student=(Student)context.getBean("student");
		System.out.println(student);

	}

}
