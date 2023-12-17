package INit_and_Destroy_Method;

import java.util.Map;

public class Address {
	
	private String city;
	private String state;
	private Map<Integer,String> places;
	
	
	public Address() {
		super();
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Map<Integer, String> getPlaces() {
		return places;
	}
	public void setPlaces(Map<Integer, String> places) {
		this.places = places;
	}
	
	public void init()
	{
		System.out.println("All databse connection gets established in address class");
		System.out.println("All Web services connection gets established in address class");
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", places=" + places + "]";
	}
	
	public void destroy()
	{
		System.out.println("All databse connection gets detached in address class");
		System.out.println("All web services connection gets detached from address class");
	}
}
