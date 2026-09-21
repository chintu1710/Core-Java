package in.co.rays.encapsulation;

public class Account {

	private String number;
	private String accounttype;
	private double balance;

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void  setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdrawl(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawl"+ amount);
		}else {
			System.out.println("Insfused balance");
		}
	}
	public void deposit(double amount) {
		if (amount > 0 ) {
			balance += amount;
			System.out.println("Deposite" + amount);	
		}else {
			System.out.println("Deposit failed! Amount must be positive.");
		}
	}
		
	}


