package Static_and_Final_Keyword;

public final class FinalClass {
      /*
       * if a class is declared by keyword final then such class is called final class
       * and final class doesnot have any child class or can say final clas cannot 
       * extends by any other class.
       * 
       * why string class is final 
       * 
       * String class is final so that final class has number of method and with the
       * help of methods we can perform various operations on string literals and get 
       * appropriate result but if the String class is not final then any other class can 
       * extends the String class and override the methods of String class and change the 
       * implementation of String class method and because of that we do not get the appropriate
       * result. Thats why String class is final.
       * 
       * anonymous object is defined as that the object without any reference if we have to 
       * use the object only once we have to use anonymous object.
       * 
       */
	
	
	static int x=20;
	
	public static void run()
	{
		System.out.println(x);
	}
	
	
	
}
