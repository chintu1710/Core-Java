package in.co.rays.poly.overriding;

public class Circle extends Shape {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
	System.out.println(Math.PI * radius*radius);
	}
	
	

}
