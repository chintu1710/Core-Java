package in.co.rays.returntype;

public class Bank {

	public String getBank() {
		return "RBI";
	}

	public double getIntrest() {
		return 0.0;
	}

	
	
	public static Bank getBank(int i) {
		if (i == 1) {
			return new HDFCBank();
		}
		if (i == 2) {
			return new ICICIBank();
		}
		if (i == 3) {
			return new AxisBank();
		}
		return new Bank();
		
		
	}
	
	
}
