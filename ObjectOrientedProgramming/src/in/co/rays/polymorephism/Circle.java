package in.co.rays.polymorephism;

public class Circle extends Shape{
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double areas=Math.PI * radius * radius;
		return areas;
	}
}
