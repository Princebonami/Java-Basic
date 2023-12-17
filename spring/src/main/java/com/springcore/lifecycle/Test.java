package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/imconfig.xml");
		Samosa s= (Samosa)context.getBean("life1");
		
		System.out.println(s);
//	 	
		// here we only got the output of init method we didnot got the output of destroy method so we have to 
		// use AbstractAppliationContext Interface inside this interface there is a method name registerShutDownHook() this method internally
		//calls destroy method to shut down all the connection before deleting the object.
        //context.registerShutdownHook(); // the return type of this method is void and it internally calls
           // destroy method this method is registering shut down hook
//	   System.out.println("===========================================================");
//	   Pepsi pepsi=(Pepsi)context.getBean("pepsi");
//	   System.out.println(pepsi);
	   
//	   System.out.println("==============================================================");
//	   
//	   Example example=(Example)context.getBean("example");
//	   System.out.println(example);
	
	
	}

}
