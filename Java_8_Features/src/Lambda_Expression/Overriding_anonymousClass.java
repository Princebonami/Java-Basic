package Lambda_Expression;

public class Overriding_anonymousClass {
	// overriding by using anonymous class
	/*
	 *  it make our program concise
	 */
	public void run()
	{
		System.out.println("My name is prince kumar");
	}
	
	

	public static void main(String[] args) {
		
		Overriding_anonymousClass a=new Overriding_anonymousClass() {
			   
			@Override
			public void run() {
				System.out.println("I am a software developer");
			}
			
			};
			a.run();
		}

}
