package in.com.rays.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPerson {
	
	public static void main(String[] args) {
		
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person(104, "Rohit", 25));
		list.add(new Person(102, "Chintu", 20));
		list.add(new Person(107, "Mayank", 64));
		list.add(new Person(103, "Ashok", 24));
		list.add(new Person(106, "Amit", 44));
		
		for (Person p : list) {
			System.out.println(p);		
		}
		
		System.out.println("=============================");
		
		Collections.sort(list);
		
		for (Person person : list) {
			System.out.println(person);
		}
		
		
	}

}
