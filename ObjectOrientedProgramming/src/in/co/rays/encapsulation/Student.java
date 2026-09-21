package in.co.rays.encapsulation;

public class Student {

	private String classs;
	private int rollno;
	private int marks;

	public void SetClasss(String classs) {
		this.classs = classs;
	}

	public void SetRollno(int rollno) {
		this.rollno = rollno;
	}

	public void SetMarks(int marks) {
		System.out.println(marks);
		if (marks >= 33) {
			
		} else {
			System.out.println("FAil");
		}
		this.marks = marks;
	}

	public String getClasss() {
		return classs;
	}

	public int getRollno() {
		return rollno;
	}

	public int getMarks() {
		return marks;

	}

}
