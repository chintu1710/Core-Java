package in.co.rays.returntype;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank[] banks = new Bank[3];
		
		
		banks[0] = Bank.getBank(1);
		banks[1] = Bank.getBank(2);
		banks[2] = Bank.getBank(3);
		
		homeloneenquiry(banks);
	}

	private static void homeloneenquiry(Bank[] banks) {
		for (int i = 0; i < banks.length; i++) {
			System.out.println(banks[i].getBank());
			System.out.println(banks[i].getIntrest());
			System.out.println("=========================");
			
		}
		
	}

}