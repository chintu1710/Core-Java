package in.com.rays.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(0, "Chintu");
		list.add(1, "Chintu");
		list.add(2, "HEllo");
		list.add(3, 22.1);
		list.add(4, true);
		list.add(5, 12);

		System.out.println(list.get(0));
		
		for (Object object : list) {
			System.out.println(object);
			
		}

	}

}
