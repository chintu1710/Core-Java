package in.com.rays.costam.list;

public class Employee {
	
	private int id;
	private String name;
	private int salery;
	private String company;
	
	public Employee(int id, String name, int salery, String company) {
		this.id= id;
		this.name = name;
		this.salery = salery;
		this.company = company;
		
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalery() {
		return salery;
	}

	public String getCompany() {
		return company;
	}

}
