package bankaccountapp;

public class Savings extends Account {
	
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	private final int ACCOUNT_TYPE = 1;
	
	Savings(String fullname, String SSN) {
		this(fullname, SSN, 0);
	}
	
	Savings(String fullname, String SSN, double initialDeposit) {
		super(fullname, SSN, initialDeposit);
		setAccountType(ACCOUNT_TYPE);
		setAccountNumber();
		setBaseRate();
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3)); 
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void setBaseRate() {
		baseRate = getBaseRate() - 0.25; 
	}
	
	public void showInfo() {
		super.showInfo();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Your Account Features: \n");
		sb.append("Safety Deposit Box ID: " + safetyDepositBoxID + "\n");
		sb.append("Safety Deposit Box Key: " + safetyDepositBoxKey + "\n");
		
		System.out.println(sb.toString());
	}
	
}
