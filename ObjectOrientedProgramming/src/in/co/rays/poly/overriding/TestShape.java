package in.co.rays.poly.overriding;

public class TestShape {
	public static void main(String[] args) {

		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();

		// test circle

		c.setRadius(25);
		c.setColour("red");
		
		System.out.println(c.getColour());
		c.area();
		
		//test rectangle
		
		r.setLength(25);
		r.setWidth(99);
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		r.area();
		
		//test triangle 
		
		  t.setHight(24);
		  t.setBase(14);
		  
		  System.out.println(t.getBase());
		  System.out.println(t.getHight());
		  t.area();

	}

}

