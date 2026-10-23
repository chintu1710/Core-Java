package in.com.rays.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(105,"chintu",250000,"TCS"));
		list.add(new Employee(106,"Ashok",250000,"TCS"));
		list.add(new Employee(107,"Ramesh",250000,"NCS"));
		list.add(new Employee(104,"Suresh",250000,"TCS"));
		list.add(new Employee(108,"Rakesh",250000,"TCS"));
		
		list.forEach(System.out::println);
		
		System.out.println("=========================");
		
		Collections.sort(list);
		System.out.println("After Sorting");

		
		list.forEach(System.out::println);
	}

}
