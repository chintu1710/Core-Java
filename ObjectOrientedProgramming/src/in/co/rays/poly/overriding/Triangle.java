package in.co.rays.poly.overriding;

public class Triangle extends Shape {

	private int base;
	private int hight;

	public void setBase(int base) {
		this.base = base;
	}

	public int getBase() {
		return base;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getHight() {
		return hight;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(base * hight / 2);
	}

}
