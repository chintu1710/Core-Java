package in.com.rays.amp;

import java.util.TreeMap;

public class TestShortedMap {
	
	
	public static void main(String[] args) {
		
		
		TreeMap t = new TreeMap();
		
		t.put(3, "Apple");
		t.put(9, "Orange");
		t.put(5, "Kivi");
		t.put(6, "Banana");
		t.put(1, "MAngo");
		
		System.out.println(t.entrySet());
		
		System.out.println(t.get(5));
		
		System.out.println(t.headMap(3));
//		System.out.println(t.value("MAngo"));
	}

}
