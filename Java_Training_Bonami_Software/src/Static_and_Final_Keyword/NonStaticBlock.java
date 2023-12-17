package Static_and_Final_Keyword;

public class NonStaticBlock {
	
	{
		System.out.println("Hello my name is prince kumar");
		System.out.println("I am a software developer");
	}

	public static void main(String[] args) {
		/*
		 *   Non static block is defined as that the block which is not declared by uisng 
		 *   keyword static.It is loaded in heap area and executed at the same time when object gets 
		 *   created.
		 *   
		 */
		NonStaticBlock n1=new NonStaticBlock();
	}

}
