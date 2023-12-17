package Static_and_Final_Keyword;

public class StaticVariable {
	
	  // static variable always be a global variable.
      static int x=20;                 // static variable
      static String name="prince";     // static variable 
      
      
      public void run()    
      {
    	  // non static method 
    	  // if we call static member into non static member  we can call it directly or by using class name 
    	  // refrence
    	  
    	  System.out.println(x);
    	  System.out.println(StaticVariable.x);
    	  
    	  System.out.println(name);
    	  System.out.println(StaticVariable.name);
      }
	public static void main(String[] args) {
		
		// if we want to call one static member inside another static member.
		
		System.out.println(x);  // we can call directly
		System.out.println(StaticVariable.x);  // by using class name refrence
		
		StaticVariable staticVariable=new StaticVariable();
		staticVariable.run();
		

	}

}
