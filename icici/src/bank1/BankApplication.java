package bank1;

public class BankApplication {
	private String accountno ;
	private double balance;
	public BankApplication(String accountno,double balance) {
		this.accountno = accountno;
		this.balance=balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) throws InsufficientFundException{
		if(amount>balance) {
			throw new InsufficientFundException("Insufficient fund");
		}
		balance = balance - amount;	
	}
	public double getBalance() {
		return balance;
	}
	public static void main(String[] args) throws InsufficientFundException {
		BankApplication ba1 = new BankApplication("9947259933",1000);
		System.out.println("Balance before withdrawing : "+ba1.getBalance() );
		ba1.withdraw(500);
		System.out.println("Balance after withdrawing : "+ba1.getBalance());
		ba1.withdraw(6000);
				
	}
	 

}
