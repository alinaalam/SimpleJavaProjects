package bankaccountapp;

public class Checking extends Account {

	private int debitCardNumber;
	private int debitCardPIN;
	
	private final int ACCOUNT_TYPE = 2;
	private double baseRate;
	
	Checking(String fullname, String SSN) {
		this(fullname, SSN, 0);
	}
	
	Checking(String fullname, String SSN, double initialDeposit) {
		super(fullname, SSN, initialDeposit);
		setAccountType(ACCOUNT_TYPE);
		setAccountNumber();
		setBaseRate();
	}
	
	public void setBaseRate() {
		baseRate = super.getBaseRate() * 0.15;
	}
}
