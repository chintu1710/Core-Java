package in.co.rays.encapsulation;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;
	
	public static final int AGE = 18;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDob(Date dob)

	{
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}

	public void setAddress(String address)

	{
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	
	public void getAge() {
		Date d = new Date();
		
		int age = d.getYear()-dob.getYear();
		
		System.out.println(age);
		
		if (age > AGE) {
			System.out.println("You Can Vote");
			
		} else {
			System.out.println("You Can Not Vote");

		}
		
	
		
	}

}
