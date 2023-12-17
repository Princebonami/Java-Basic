package Static_and_Final_Keyword;

public class FinalVariable {
    /*
     *  final keyword is defined as that the keyword which is used to restrict the
     *  modification in member.Final can be variable,method and class. 
     */
	
	/*
	 *  If a variable is declared with keyowrd final then such vaiable is called final variable
	 *  if a final variable is initialize once we cannot modify it.
	 *  
	 *  And the final variable without any decleration is called blank final variable.
	 *  as it is initialize once we cannot change or modify it.
	 */
	
	public static void main(String[] args) {
		
		final int x=20; // final variable
		System.out.println(x);
	    
		
		final int y;   // blank final variable
		y=30;          // and now we cannot modify it
		
		System.out.println(y);

	}

}
