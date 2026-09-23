package in.co.raysconstroctor;

public class Shape {
	
	
	protected int boderwidth;
	protected String colour;
	
	
	public Shape() {
		System.out.println("Its a Deafault Constructor");
		
	}
	
	
	
	public Shape(int boderwidth , String colour) {
		this.boderwidth = boderwidth;
		this.colour = colour;
		System.out.println(this.colour);
		System.out.println(this.boderwidth);
	}
	

}
