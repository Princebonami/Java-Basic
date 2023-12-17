package com.springcore.ci;

public class Addition {
	
	private int a;
	private int b;
	
	
	
	public Addition() {
		super();
	}



	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor : int, int");
	}

	public Addition(double a,double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("constructor : double,double");
	}



	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "] is" +(a+b);
	}
	
	
	
	

}
