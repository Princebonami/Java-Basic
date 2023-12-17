package AmbiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("AmbiguityProblem/config.xml");
		Student student=context.getBean(Student.class);
		System.out.println(student);

	}

}
