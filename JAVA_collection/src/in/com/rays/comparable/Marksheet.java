package in.com.rays.comparable;

public class Marksheet implements Comparable<Marksheet>{
	
	private int id;
	private String name;
	private int phy;
	private int chem;
	private int math;
	
	public Marksheet(int id, String name, int phy, int chem, int math) {
		this.id = id;
		this.name = name;
		this.phy = phy;
		this.chem = chem;
		this.math = math;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "id: " + id + ", name: " + name + ", phy: " + phy + ", chem: " + chem + ", math: " + math;
	}
	@Override
	public int compareTo(Marksheet o) {
		// TODO Auto-generated method stub
		return o.id - this.id;
	}
	
	
	

}
