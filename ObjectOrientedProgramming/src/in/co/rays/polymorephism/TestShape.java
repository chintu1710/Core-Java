package in.co.rays.polymorephism;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(9);
		Rectangle r = (Rectangle) s[1];
		r.setLength(8);
		r.setWidth(7);
		Triangle t = (Triangle) s[2];
		t.setBase(4);
		t.setHight(4);

		totalArea(s);

	}

	private static void totalArea(Shape[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());

		}

	}

}
