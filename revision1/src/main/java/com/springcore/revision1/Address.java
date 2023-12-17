package com.springcore.revision1;

public class Address {
	
	private String street;
	private String city;
	private String State;
	
	public Address() {
		super();
	}
	
	
	
	
	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		State = state;
	}




	@Override
	public String toString() {
		return "street=" + street + ", city=" + city + ", State=" + State;
	}
	
	
	
	

}
