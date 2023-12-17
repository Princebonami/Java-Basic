package springPrimitiveDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springPrimitiveDependency/config.xml");
		Address address=(Address)context.getBean("address");
		System.out.println(address);
		
		System.out.println("====================================================");
		Student student=(Student)context.getBean("student");
		System.out.println(student);

	}

}
