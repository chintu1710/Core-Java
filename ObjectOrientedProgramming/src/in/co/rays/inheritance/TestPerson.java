package in.co.rays.inheritance;

public class TestPerson {
	public static void main(String[] args) {
		
//		Test Doc
		
		Doctor d = new Doctor();
		
		d.setName("Rohit");
		d.setAddress("Pithampr");
		d.setRegistrationNO("1232525d");
		
		System.out.println(d.getName());
		System.out.println(d.getAddress());
		System.out.println(d.getRegistrationNO());
		
//		Test Student
		
		Student s = new Student();
		
		s.setName("AAru");
		s.setMarks(36);
		s.setRollno("ADS62648");
		
		System.out.println(s.getName());
		System.out.println(s.getMarks());
		System.out.println(s.getRollno());
		
		
		
//		Test Businessman
		
		Businessman b = new Businessman();
		
		b.setName("Ashok");
		b.setIncome(100000);
		b.setAddress("indore");
		
		System.out.println(b.getName());
		System.out.println(b.getIncome());
		System.out.println(b.getAddress());
	}

}
