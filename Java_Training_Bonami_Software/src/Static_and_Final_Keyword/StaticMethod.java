package Static_and_Final_Keyword;

public class StaticMethod {
       
	
	  public static void run()      
	  {
		  // static method 
		  System.out.println("I am running");
		  System.out.println("I am walking");
		  System.out.println("I am jumping");
	  }
	  
	  public void walk()
	  {
		  // in non static we can call static method directly or by using class name refrence
		  run();
		  StaticMethod.run();
	  }
	   public static void main(String[] args) {
		/*
		 *    Static method is defined as that the method which is declared by keyword static
		 *    .It is loaded only once in class static area and shared among all object in heap area.
		 *    It is called in same class by using class name refrence or directly.In other class called directly
		 *    
		 *    
		 *    in static method we can call it directly or by using class name refrence.
		 */
		   
		   run();
		   
		   StaticMethod.run();
		   
		   StaticMethod staticMethod=new StaticMethod();
		   staticMethod.walk();
		   
		   
		   
		   
	}
}
