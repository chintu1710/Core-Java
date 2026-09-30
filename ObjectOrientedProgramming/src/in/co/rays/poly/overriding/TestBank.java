
package in.co.rays.poly.overriding;

public class TestBank {
	public static void main(String[] args) {

		Bank[] b = new Bank[3];

		b[0] = new HDFCBank();
		b[1] = new AxisBank();
		b[2] = new ICICIBank();

		HDFCBank h = (HDFCBank) b[0];

		h.getBank();
		h.getIntrest();

		AxisBank a = (AxisBank) b[1];

		a.getBank();
		a.getIntrest();

		ICICIBank i = (ICICIBank) b[2];

		i.getBank();
		i.getIntrest();

		loanEnquire(b);

	}

	private static void loanEnquire(Bank[] b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].getBank());
			System.out.println(b[i].getIntrest());
			System.out.println("=============");
		}

	}

}
