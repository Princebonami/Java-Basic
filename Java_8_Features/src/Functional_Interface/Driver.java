package Functional_Interface;
import java.util.Scanner;

public class Driver {
	// it is an example of tightly coupled so to make it loosly coupled.
	public static void main(String[] args) {
		Car c1=new Car("Tata","Red");
		
		c1.display();
		c1.e.display();
		
		
		
		
	}

}
