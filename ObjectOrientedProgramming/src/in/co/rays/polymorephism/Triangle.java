package in.co.rays.polymorephism;

public class Triangle  extends Shape{
	
	private int hight;
	private int base;
	
	
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		System.out.println(hight * base/2);;
		return 0;
	}

}
