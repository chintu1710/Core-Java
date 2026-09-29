package in.co.rays.poly.overriding;

public class Shape {

	private int boderwidth;
	private String colour;

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

	public void area() {
		System.out.println("its method of shape calss");
	}
	
	

}
