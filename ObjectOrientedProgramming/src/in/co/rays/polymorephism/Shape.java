package in.co.rays.polymorephism;

public class Shape {

	protected int boderwidth;
	protected String colour;

	public int getBoderwidth() {
		return boderwidth;
	}

	public void setBoderwidth(int boderwidth) {
		this.boderwidth = boderwidth;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public double area() {
		System.out.println("This is a Shape Class");
		return 0.0;
	
	}

}
