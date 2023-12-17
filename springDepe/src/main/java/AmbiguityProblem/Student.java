package AmbiguityProblem;

public class Student {
	
	private int id;
	private String name;
	
	public Student() {
		super();
	}

    public Student(int id, String name) {
		super();
		System.out.println("This is int string type constructor");
		this.id = id;
		this.name = name;
	}
    public Student(double id, String name) {
		super();
		System.out.println("This is double string type constructor");
		this.id = (int)id;
		this.name = name;
	}
    public Student(String id, String name) {
		super();
		System.out.println("This is String String type constructor");
		this.id = Integer.parseInt(id);
		this.name = name;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}
    
    
	
	
}
