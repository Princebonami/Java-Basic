package crud_operation_by_using_Statement_Interface;

import java.util.Comparator;

public class Program1 {

	static Comparator<Integer> c1=(a,b)->
	{
		return a.compareTo(b);
	};
	
	public static void main(String[] args) {
		
		System.out.println(c1.compare(10,9));
	}
}


