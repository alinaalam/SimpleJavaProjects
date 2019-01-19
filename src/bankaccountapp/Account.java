package bankaccountapp;

public class Account {
	
	private String fullname;
	private String SSN;
	private double currentBalance;
	private String accountNumber;
	private int accountType;
	
	Account(String fullname, String SSN, double initialDeposit) {
		this.fullname = fullname;
		this.SSN = SSN;
		this.currentBalance = initialDeposit;
	}
	
	public void setAccountType(int accountType) {
		accountType = accountType;
	}
	
	public void setAccountNumber() {
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
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
