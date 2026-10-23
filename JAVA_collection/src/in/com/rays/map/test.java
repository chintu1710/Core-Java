package in.com.rays.map;

import java.util.HashMap;

public class test {
	
	public static void main(String[] args) {
		
		
		int i = 12;
		i = 15;
		System.out.println(i);
		
		HashMap map = new HashMap();
		
		map.put(1, "Aman");
		map.put(2, "Rohit");
		map.put(1 ,"Chintu");
		map.put(3, "nikatan");
		
		System.out.println(map.get(1));
		System.out.println(map.size());
		
		System.out.println(map);
	}

}
