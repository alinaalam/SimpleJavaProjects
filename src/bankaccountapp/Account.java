package bankaccountapp;

public abstract class Account implements IBaseRate {
	
	private String fullname;
	private String SSN;
	private double currentBalance;
	private String accountNumber;
	private int accountType;
	
	protected double baseRate;
	protected double compoundInterest;
	
	private static int index;
	
	Account(String fullname, String SSN, double initialDeposit) {
		this.fullname = fullname;
		this.SSN = SSN;
		this.currentBalance = initialDeposit;
		
		setBaseRate();
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
	
	public abstract void setBaseRate();
	
	public void compountInterest() {
		compoundInterest = currentBalance * (baseRate/100);
		currentBalance += compoundInterest;
		System.out.println("Accrued Interest is $: " + compoundInterest);
		printBalance();
	}
	
	public void deposit(double amount) {
		currentBalance += amount;
		System.out.println("You have successfully deposited $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		currentBalance -= amount;
		System.out.println("You have successfully withdrawn $" + amount);
		printBalance();
	}
	
	public void transfer(String account, double amount) {
		System.out.println("Transferring $" + amount + " to Account: " + account);
		currentBalance -= amount;
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is: " + currentBalance);
	}
	
	public void showInfo() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Name: " + fullname + "\n");
		sb.append("Account Type: " + accountType + "\n");
		sb.append("Account Number: " + accountNumber + "\n");
		sb.append("Balance: " + currentBalance + "\n");
		sb.append("Base Rate: " + baseRate + "%\n");
		
		System.out.println(sb.toString());
	}
}
