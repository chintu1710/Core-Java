package in.co.rays.returntype;

public class Shape {

	private String colour;
	private int boderwidth;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getBoderwidth() {
		return boderwidth;
	}

	public void setBoderwidth(int boderwidth) {
		this.boderwidth = boderwidth;
	}
	
	public double area() {
		return 0.0;
	}

	public static Shape getShape(int i) {
		if (i == 1) {
			return new Circle();
		}
		if (i == 2) {
			return new Rectangle();
		}
		if (i == 3) {
			return new Triangle();
		}
		return new Shape();

	}
}
