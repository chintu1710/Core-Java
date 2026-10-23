package in.com.rays.list;

import java.util.ArrayList;
import java.util.List;

public class UniqueElemant {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("chintu");
		list.add(75);
		list.add(12);
		list.add(true);
		list.add("Ashok");
		list.add("chintu");
		list.add("chintu");
		list.add(21);
		list.add(12);

		System.out.println(list);

		List<Object> uniqueList = new ArrayList<>();

		for (Object obj : list) {
			if (!uniqueList.contains(obj)) {
				uniqueList.add(obj);

			}

		}

		System.out.println(uniqueList);
	}

}
