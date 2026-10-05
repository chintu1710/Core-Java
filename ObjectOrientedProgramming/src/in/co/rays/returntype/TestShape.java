package in.co.rays.returntype;

public class TestShape {
	
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		
		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);
		s[2] = Shape.getShape(3);
		
		
		Circle c = (Circle)s[0]; 
		
		c.setRadius(12);
		
		Rectangle r = (Rectangle)s[1];
		
		r.setLength(12);
		r.setWidth(12);
		
		
		Triangle t = (Triangle)s[2];
		
		t.setHight(12);
		
		t.setBase(16);
		
		useshapearea(s);
	}

	private static void useshapearea(Shape[] s) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
			System.out.println("================");
			
		}
		
	}
	
	

}
