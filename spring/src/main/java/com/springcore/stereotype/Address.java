package com.springcore.stereotype;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	Scanner sc=new Scanner(System.in);
	
	@Value("Shokahara")
	private String street;
	@Value("Barauni")
	private String city;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {
		super();
	}
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
	
	
	

}
