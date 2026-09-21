package in.co.rays.inheritance;

public class Student extends Person{
	
	private String rollno;
	private int marks;
	
	
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getRollno() {
		return rollno;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}

}
