package in.co.rays.encapsulation;

public class Automobile {

	private String colour;
	private int speed;
	private String make;

	public static final int NO_OF_GEARS = 5;

	public void SetColour(String colour) {
		this.colour = colour;
	}

	public void SetSpeed(int speed) {
		this.speed = speed;
	}

	public void SetMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public int getSpeed() {
		return speed;
	}

	public String getMake() {
		return make;

	}

	public void getGears(int gears) {
		if (gears <= NO_OF_GEARS && gears > 0) {
			System.out.println("Gears change" + gears);
		} else {
			System.out.println("Invalid gears" + gears);
		}
	}

	public void getSpeed(int gears) {
		if (gears == 1) {
			speed = speed + 10;

		} else if (gears == 2) {
			speed = 30 + 20;

		} else if (gears == 3) {
			
			speed = speed + 50;
			System.out.println(speed);
			
		}else if (gears == 4) {
			speed = 80+60;
			
		}else if (gears == 5) {
			speed = 100+80;
		}
		
		else {
			System.out.println("invalid gear");
		}

	}

}
