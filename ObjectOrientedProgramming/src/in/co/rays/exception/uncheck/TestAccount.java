package in.co.rays.exception.uncheck;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(500);
		
		System.out.println(a.getBalance());
		
		a.withdrawl(1000);
	}

}
