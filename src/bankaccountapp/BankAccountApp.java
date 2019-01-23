package bankaccountapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import utilities.CSV;

/**
 * Scenario: You are a back end developer and need to create an application
 * to handle new customer bank account requests
 * The application should do the following:
 * 1) Read a .csv file of names, social security numbers, account types and initial deposit
 * 2) Use a proper data structure to hold all these accounts
 * 3) Both savings and checking accounts share the following properties:
 * 	deposit()
 * 	withdraw()
 * 	transfer()
 * 	showInfo()
 * 	11-Digit Account Number (generated with the following process: 1 or 2 depending on Savings 
 * 	or Checking, last two digits of SSN, unique 5-digit number and random 3 digit number)
 * 4) Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and
 * accessed with a 4-digit code
 * 5) Checking Account holders are assigned a Debit Card with a 12-digit number and a 4-digit PIN
 * 6) Both accounts will use an interface that determines the base interest rate
 * 	Savings account will use .25 points less than the base rate
 * 	Checking accounts will use 15% of the base rate
 * 7) The ShowInfo method should reveal relevant account information as well as information specific
 * to the Checking Account or Saving Account
 * @author alinaalam
 *
 */
public class BankAccountApp {
	
	public static String filename = "data/NewBankAccounts.csv";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			List<String[]> accounts = CSV.read(filename);
			List<Account> customerAccounts = new LinkedList<Account>();
			
			for(String[] account : accounts) {
				customerAccounts.add(storeAccountsInformation(account));
			}
			
			for(Account account: customerAccounts) {
				account.showInfo();
			}
			
		} catch(Exception e) {
			System.out.println("Unable to read file");
			e.printStackTrace();
		}
		
	}
	
	public static Account storeAccountsInformation(String[] parsedAccountInfo) {
		
		if(parsedAccountInfo.length > 3) {
			
			String fullname = parsedAccountInfo[0];
			String SSN = parsedAccountInfo[1];
			String accountType = parsedAccountInfo[2];
			double initialDeposit = Double.parseDouble(parsedAccountInfo[3]);
			
			Account account;
			
			if(accountType.contains("Savings")) {
				account = new Savings(fullname, SSN, initialDeposit);
			}
			else {
				account = new Checking(fullname, SSN, initialDeposit);
			}
			
			return account;
		}
		else {
			System.out.println("Incomplete Account Info for " + String.join(",", parsedAccountInfo));
			return null;
		}
	}

}
