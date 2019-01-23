package bankaccountapp;

public class Savings extends Account {
	
	private int safetyDepositBoxID;
	private int safetyDeposityBoxKey;
	
	private final int ACCOUNT_TYPE = 1;
	private double baseRate;
	
	Savings(String fullname, String SSN) {
		this(fullname, SSN, 0);
	}
	
	Savings(String fullname, String SSN, double initialDeposit) {
		super(fullname, SSN, initialDeposit);
		setAccountType(ACCOUNT_TYPE);
		setAccountNumber();
		setBaseRate();
	}
	
	public void setBaseRate() {
		baseRate = super.getBaseRate() - 0.25; 
	}
	
}
