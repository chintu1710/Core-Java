package in.com.rays.comparable;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int salary;
	private String company;

	public Employee(int id, String name, int salary, String company) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + "name=" + name + "salary=" + salary + "company=" + company;
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}
}