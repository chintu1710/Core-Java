package in.co.rays.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();
		Rectangle r = new Rectangle();
//      test circle		
		c.setCircle(12);
		c.setBoderwidth(18);
		c.setColour("blue");

//		test rectangle
		r.setLength(18);
		r.setWidth(12);

//      test circle
		System.out.println(c.getBoderwidth());
		System.out.println(c.getCircle());
		System.out.println(c.getcolour());

//		Test Rectangle
		System.out.println(r.getLength());
		System.out.println(r.getWidthh());
		
		
//		Test triangle
		Triangle t = new Triangle();
		
		t.setBase(15);
		t.setHight(13);
		
		
		System.out.println(t.getBase());
		System.out.println(t.getHight());
		
	}

}
