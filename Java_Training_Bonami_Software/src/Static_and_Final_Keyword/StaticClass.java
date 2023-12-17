package Static_and_Final_Keyword;

public class StaticClass {
    /*
     *   Static class is defined as that the class which is declared by uisng keyword
     *   static. Only inner class can be static class outer class cannot be inner class
     *   and the inner class can be access by using outer class refrence.
     */
	static String name="sakshi";
	
	static class A{
		
		static int x=20;
		
	}
	public static void main(String[] args) {
		
		System.out.println(StaticClass.name);
		System.out.println(StaticClass.A.x);
		
		
		
		
	}

}
