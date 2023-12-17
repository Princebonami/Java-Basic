package Functional_Interface;

import java.util.concurrent.SynchronousQueue;

public class Example  {
	
	public synchronized void play(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("My name is "+name);
			
		}
		
		
		
	}
	
	

}
