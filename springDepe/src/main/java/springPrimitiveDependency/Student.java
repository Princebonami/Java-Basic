package springPrimitiveDependency;

public class Student {
	
	private int id;
	private String name;
	
	private Address address;

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setter method of id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address;
	}
	
	

}