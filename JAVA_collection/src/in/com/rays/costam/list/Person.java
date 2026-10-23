package in.com.rays.costam.list;

public class Person {
	
	private String name;
	private int age;
	private String address;
	private String email;
	
	
	public Person(String name, int age, String address, String email) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getAddress() {
		return address;
	}


	public String getEmail() {
		return email;
	}
	
}
