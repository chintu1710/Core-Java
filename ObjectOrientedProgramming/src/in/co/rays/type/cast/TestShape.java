package in.co.rays.type.cast;

public class TestShape {
	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		s.setBoderwidth(25);
		s.setColour("red");
		s.setSize(99);
		
		
		Shape c = new Circle();
		
		
		
		Circle c1 = (Circle) c;
		
		c1.setColour("Black");
		c1.setRadius(29);
		c1.area();
		
		System.out.println(c1.getColour());
		System.out.println(c1.getRadius());
		}

}
