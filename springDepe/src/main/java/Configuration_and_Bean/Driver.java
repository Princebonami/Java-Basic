package Configuration_and_Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Driver {

	public static void main(String[] args) {
		// by using xml configuration
		// by using @autowiring and @qualifier
		// by uisng @component @autowired @ value 
		// by completely removing xml file byu using @configuration @bean
		ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("=================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		

	}

}
