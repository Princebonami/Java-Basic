package CollectionAndREfrenceDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("CollectionAndREfrenceDependency/deconfig.xml");
		Address address=(Address)context.getBean("address");
		System.out.println(address);
		
		System.out.println("======================================================================");
        Student student=(Student)context.getBean("student");
        System.out.println(student);
		
		
	}

}
