package in.com.rays.costam.list; 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1,"Ram", 252000, "TCS");
		Employee e2 = new Employee(2,"Shayam", 2000, "Ncs");
		Employee e3 = new Employee(3,"Rohit", 252000, "Microsoft");
		Employee e4 = new Employee(4,"Chintu", 2520000, "SpaceX");
		Employee e5 = new Employee(5,"Karuna", 50000000, "Tesla");
		
		
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Iterator<Employee> it = list.iterator();
		
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.getId());
			System.out.println(e.getCompany());
			System.out.println(e.getName());
			System.out.println(e.getSalery());
			
		}
		
		
	}

}
