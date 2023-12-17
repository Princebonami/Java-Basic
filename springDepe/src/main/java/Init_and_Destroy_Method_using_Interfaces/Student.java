package Init_and_Destroy_Method_using_Interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
	
	private int id;
	private String name;
	private Address address;
	
	
	public Student() {
		super();
	}
	
    

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}



	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address;
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("It act as destroy method used to detach the database connection at end");
		
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("It act as init method used to set dabase connection");
		
	} 
	

}
