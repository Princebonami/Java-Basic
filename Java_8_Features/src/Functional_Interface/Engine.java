package Functional_Interface;

public class Engine {
	
	int cc;
	int strokes;
	
	Engine(int cc,int strokes)
	{
		this.cc=cc;
		this.strokes=strokes;
	}
	
	public void display()
	{
		System.out.println(cc+" "+strokes);
	}
	
	

}
