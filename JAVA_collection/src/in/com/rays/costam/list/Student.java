package in.com.rays.costam.list;

public class Student {

	private int id;
	private String name;
	private String clas;
	private int percentage;

	public Student(int id ,String name, String clas, int percentage) {
		
		this.clas = clas;
		this.name = name;
		this.id = id;
		this.percentage = percentage;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getClas() {
		return clas;
	}

	public int getPercentage() {
		return percentage;
	}

}
