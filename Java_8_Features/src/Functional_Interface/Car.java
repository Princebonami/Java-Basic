package Functional_Interface;


public class Car {
	
	String name;
	String color;
	Engine e=new Engine(10,12);
	
	Car(String name,String color)
	{
		this.name=name;
		this.color=color;
	}
	
	public void display()
	{
		System.out.println(name+" "+color);
	}
	
	
	

}
