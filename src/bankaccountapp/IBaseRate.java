package bankaccountapp;

public interface IBaseRate {

	// Write a function that returns the base rate
	default double getBaseRate() {
		return 4.5;
	}
	
}
