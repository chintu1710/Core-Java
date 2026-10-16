package in.com.rays.list;

import java.util.ArrayList;

public class TestArrayListFind {
	
	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		
		
		list.add("Chintu");
		list.add("Rohit");
		list.add("Ram");
		list.add("Ram");
		list.add("Ram");
		list.add("Ram");
		list.add(true);
		list.add(12);
		
		int count = 0;
		
		System.out.println(list);
		
		System.out.println(list.remove(4));
		
		for (int i = 0; i < list.size(); i++) {
			if ("Ram".equals(list.get(i))) {
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
