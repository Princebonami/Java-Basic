package com.springcore.collections;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
      ApplicationContext context1=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
      Employees employee1=(Employees)context1.getBean("employee1");
      System.out.println(employee1);
      
      System.out.println("===================================================================");
      System.out.println("==============================================");
      System.out.println(employee1.getName());
      List<String> l1=employee1.getPhones();
      for(int i=0;i<l1.size();i++)
      {
    	  System.out.print(l1.get(i)+" ");
      }
      System.out.println();
      System.out.println("=======================================================");
      
      Set<String> s1=employee1.getAddress();
      for(String x:s1)
      {
    	  System.out.print(x+" ");
      }
      System.out.println();
      System.out.println("===========================================================");
      Map<String,String> m1=employee1.getCourses();
      
      for(Map.Entry<String, String> m2 : m1.entrySet())
      {
    	  System.out.print(" "+m2.getKey()+"="+m2.getValue());
      }
      System.out.println();
      System.out.println("==============================================================");
      Properties p1=employee1.getPros();
      Set set = p1.entrySet();
      Iterator i1=set.iterator();
      while(i1.hasNext())
      {
    	  Map.Entry<String,String> m5= (Map.Entry<String, String>)i1.next();
    	  System.out.print(" "+m5.getKey()+"="+m5.getValue());
    	  
      }
      
	}

}
