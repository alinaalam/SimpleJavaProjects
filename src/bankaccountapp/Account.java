package bankaccountapp;

public abstract class Account implements IBaseRate {
	
	private String fullname;
	private String SSN;
	private double currentBalance;
	private String accountNumber;
	private int accountType;
	private final double BASE_RATE = 100;
	private static int index;
	
	Account(String fullname, String SSN, double initialDeposit) {
		this.fullname = fullname;
		this.SSN = SSN;
		this.currentBalance = initialDeposit;
	}
	
	static {
		index = 10000;
	}
	
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	
	/**
	 * 11-Digit Account Number (generated with the following process: 1 or 2 depending on Savings 
	 * or Checking, last two digits of SSN, unique 5-digit number and random 3 digit number)
	 */
	protected void setAccountNumber() {
		StringBuilder sb = new StringBuilder();
		sb.append(accountType);
		sb.append(SSN.substring(SSN.length()-2));
		sb.append(index++);
		int rand = (int) (Math.random() * Math.pow(10, 3));
		sb.append(rand);
		accountNumber = sb.toString();
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBaseRate() {
		return BASE_RATE;
	}
	
	public void deposit(double amount) {
		
	}
	
	public void withdraw(double amount) {
		
	}
	
	public void transfer(double amount) {
		
	}
	
	public void showInfo() {
		
	}
}
