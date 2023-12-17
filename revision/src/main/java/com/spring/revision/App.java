package com.spring.revision;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Exception
    {
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/revision/config.xml");
    	Student student=(Student) context.getBean("student");
    	System.out.println(student);
    	student.afterPropertiesSet();
    	student.destroy();
    	
    	
         
    }
}
