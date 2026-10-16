package in.com.rays.inerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Apple");
		list.add("Mango");
		list.add("Kivi");
		list.add("Pumgranet");
		list.add("Apple");
		list.add("lichi");
		list.add("Apple");

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);

		}

	}

}
