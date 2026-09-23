package in.co.raysconstroctor;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius ,String colour , int boderwidth) {
		this.radius = radius;
		this.boderwidth = boderwidth;
		this.colour= colour;
		System.out.println(radius);
		System.out.println(colour);
		System.out.println(boderwidth);
	}

}
