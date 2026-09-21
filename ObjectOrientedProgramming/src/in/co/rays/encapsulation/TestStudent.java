package in.co.rays.encapsulation;

public class TestStudent {
	public static void main(String[] args) {
		
		Student st = new Student();
		
		
		st.SetClasss("12th");
		st.SetRollno(15320114);
		st.SetMarks(32);
		
		System.out.println(st.getClasss());
		st.getMarks();
		System.out.println(st.getRollno());
		
	}

}
