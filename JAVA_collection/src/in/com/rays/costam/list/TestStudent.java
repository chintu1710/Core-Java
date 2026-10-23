package in.com.rays.costam.list;

import java.util.ArrayList;
import java.util.List;


public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student(132, "Rohit", "12th", 95);
		Student s2 = new Student(133, "Ram", "12th", 33);
		Student s3 = new Student(134, "Mohit", "6th", 85);
		Student s4 = new Student(135, "Sita", "12th", 72);
		Student s5 = new Student(136, "Mohit", "11th", 64);

		List<Student> list = new ArrayList<Student>();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for (Student s : list) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getClas());
			System.out.println(s.getPercentage());
			System.out.println("------");
		}
	}
}