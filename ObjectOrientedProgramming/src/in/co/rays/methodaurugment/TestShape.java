package in.co.rays.methodaurugment;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape[] shape = new Shape[3];
		
		shape[0] = new Circle();
		shape[1] = new Rectangle();
		
		Circle c = (Circle)shape[0];
		
		c.setRadius(12);
		
		Rectangle  r = (Rectangle)shape[1];
		
		r.setLength(12);
		r.setWidth(12);
		
		Triangle t = (Triangle)shape[2];
		
		t.setBase(12);
		t.setHight(12);
		
		
		totalarea(shape);
	}

	private static void totalarea(Shape[] shape) {
		
		double sum = 0;
		for (int i = 0; i < shape.length; i++) {
			double areas = shape[i].area();
		//	System.out.println((i+1) + areas);
			
			sum += areas;
			
		}
		System.out.println(sum);
	}

}
