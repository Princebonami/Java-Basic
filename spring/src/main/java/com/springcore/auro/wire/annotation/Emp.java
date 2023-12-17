package com.springcore.auro.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		
		this.address = address;
	}

	public Emp() {
		super();
	}
    
	@Autowired
	@Qualifier("add1")
	public Emp(Address address) {
		System.out.println("AHHhhhh");
		this.address = address;
	}

	@Override
	public String toString() {
		return "address=" + address;
	}

}
