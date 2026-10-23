package in.com.rays.comparable;

public class Person implements Comparable<Person> {
	
	private int id;
	private String name;
	private int age;
	
	
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

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
	

}
