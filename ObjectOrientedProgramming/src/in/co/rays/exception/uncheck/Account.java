	package in.co.rays.exception.uncheck;
	
	public class Account {
		
		private double balance;
		
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public double getBalance() {
			return balance; 
		}
		public void withdrawl(double amount) {
			if (amount> this.balance) {
				throw new InsufficentFundException();
				
			} else {
				
				this.balance = this.balance - amount;
				System.out.println(balance);
	
			}
		}
	
	}
