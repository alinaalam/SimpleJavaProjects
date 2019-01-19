package bankaccountapp;

public class Checking extends Account {

	Checking(String fullname, String SSN) {
		super(fullname, SSN, 0);
	}
	
	Checking(String fullname, String SSN, double initialDeposit) {
		super(fullname, SSN, initialDeposit);
	}
}
