package Functional_Interface;

import java.util.List;
import java.util.function.Consumer;

public class PersonImplementation {
	
	static Consumer<List<Person>> c1=(p)->{
		// its resposibility is to print all the element in list.
		
		for(Person x : p)
		{
			System.out.println(x);
		}
	};
	
	static Consumer<List<Person>> c2=(p)->
	{
		// its resonsibility is to print all name in upper case letter
		
		for(Person x:p)
		{
			System.out.println(x.getName().toUpperCase());
		}
	};
	
	static Consumer<List<Person>> c3=(p)->
	{
		for(Person x:p)
		{
			for(String s:x.hobbies)
			{
				System.out.print(s+" ");
			}
			System.out.println();
		}
	};

	public static void main(String[] args) {
		c1.accept(PersonRepository.getAllPerson());
		System.out.println("======================================");
		c2.accept(PersonRepository.getAllPerson());
		System.out.println("=======================================");
		c3.accept(PersonRepository.getAllPerson());
		System.out.println("=======================================");

	}

}
