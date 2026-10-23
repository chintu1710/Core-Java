package in.com.rays.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		List<Marksheet> list = new ArrayList<Marksheet>();
		
		
		list.add(new Marksheet(1, "A", 90, 80, 70));
		list.add(new Marksheet(3, "D", 80, 70, 60));
		list.add(new Marksheet(4, "E", 70, 60, 50));
		list.add(new Marksheet(6, "B", 60, 50, 40));
		list.add(new Marksheet(5, "K", 50, 40, 30));
		
		list.forEach(System.out::println);
		
		System.out.println("=========================");
		
		Collections.sort(list);
		
		list.forEach(System.out::println);

		
			
		
		
	
	}

}
