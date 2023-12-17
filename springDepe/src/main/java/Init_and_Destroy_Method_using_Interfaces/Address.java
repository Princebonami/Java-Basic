package Init_and_Destroy_Method_using_Interfaces;

public class Address {
	
	private String city;
	private String state;
	
	public Address() {
		super();
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
	

}
