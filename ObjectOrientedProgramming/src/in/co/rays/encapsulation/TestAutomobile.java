package in.co.rays.encapsulation;

public class TestAutomobile {
	public static void main(String[] args) {
		
		Automobile a = new Automobile();
		
		a.SetColour("red");
		a.SetMake("honda");
		
		a.getGears(4);
		
		System.out.println("Color"+ a.getColour());
		System.out.println("make"+ a.getMake());
		System.out.println("Speed"+ a.getSpeed());
		
		a.getSpeed(3);
	}

}
