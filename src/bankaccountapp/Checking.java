package bankaccountapp;

public class Checking extends Account {

	private int debitCardNumber;
	private int debitCardPIN;
	
	private final int ACCOUNT_TYPE = 2;
	
	Checking(String fullname, String SSN) {
		this(fullname, SSN, 0);
	}
	
	Checking(String fullname, String SSN, double initialDeposit) {
		super(fullname, SSN, initialDeposit);
		setAccountType(ACCOUNT_TYPE);
		setAccountNumber();
		setBaseRate();
		setDebitCardParameters();
	}
	
	private void setDebitCardParameters() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void setBaseRate() {
		baseRate = getBaseRate() * 0.15;
	}
	
	public void showInfo() {
		super.showInfo();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Your Account Features: \n");
		sb.append("Debit Card Number: " + debitCardNumber + "\n");
		sb.append("Debit Card PIN: " + debitCardPIN + "\n");
		
		System.out.println(sb.toString());
	}
}
