package bankaccountapp;

public class Savings extends Account {
	
	Savings(String fullname, String SSN) {
		super(fullname, SSN, 0);
	}
	
	Savings(String fullname, String SSN, double initialDeposit) {
		super(fullname, SSN, initialDeposit);
		setAccountType(1);
	}
	
}
