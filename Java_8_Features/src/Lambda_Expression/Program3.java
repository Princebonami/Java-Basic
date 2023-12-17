package Lambda_Expression;

import java.util.Comparator;

public class Program3 {
	
	
	
	public static void main(String[] args) {
		
		Comparator<Integer> c1=(Integer a,Integer b)->{
			
			return a.compareTo(b);
			
		};
		System.out.println(c1.compare(10,15));
		
	}

}
