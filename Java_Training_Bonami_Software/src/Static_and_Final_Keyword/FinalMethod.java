package Static_and_Final_Keyword;

public class FinalMethod {
 
	/*
	 *  Final Method is defined as that the method which is declared by uisng keyword final.
	 *  if the method is final then we cannot override that method.
	 */
	public void walk()
	{
		System.out.println("I am walking");
	}
	public final void run()
	{
		// we can't override this method because this method is final. 
		System.out.println("I am running");
		
	}
	

}
