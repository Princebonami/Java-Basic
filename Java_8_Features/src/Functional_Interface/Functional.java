package Functional_Interface;

import java.util.function.BinaryOperator;

import javax.sound.midi.Soundbank;

// This is a functional interfaces 
// now we have to use lembda expression 
public class Functional {
	
	
	public static void main(String[] args) {
		int x =11;
		int y;
		y=9;
		System.out.println(x);
		System.out.println(y);
		
	BinaryOperator<Integer> binaryOperator=(a,b)->{
		
		return Integer.compare(a,b);
		
	};
	System.out.println(binaryOperator.apply(10,10));
	
	}
	
	/*
	 *    Function take one value and return value  method apply
	 *    Consumer take one value only and return nothing   method accept
	 *    Supplier   not take nay value return some value  its method is get()
	 *    
	 *    Predicate it take only one value and return Boolean values.
	 */

}
