package Static_and_Final_Keyword;

public class FinalMethodChild extends FinalMethod {

	@Override
	public void walk() {
		System.out.println("Bolo ram ram ram sia ram ram ram");
	}
	
	public static void main(String[] args) {
		
		FinalMethod f1=new FinalMethodChild();
		f1.walk();
	}

}
