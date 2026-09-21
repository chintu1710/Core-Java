package in.co.rays.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		
		
		a.setAccounttype("Saving");
		a.setBalance(25100.60);
		a.setNumber("ICICI153201001914");
		
		
		
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccounttype());
		a.withdrawl(1500);
		System.out.println(a.getBalance());
		a.deposit(50000);
		System.out.println(a.getBalance());
	}	
}
