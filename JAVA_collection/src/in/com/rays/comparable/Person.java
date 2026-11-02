package in.com.rays.comparable;

public class Person implements Comparable<Person> {
	
	public int id;
	public String name;
	public int age;
	
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID = " + id + ", Name = " + name + ", Age = " + age;
	}

	
	

}
