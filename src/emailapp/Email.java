package emailapp;

import java.util.Date;
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String companyDomain;
	private String email;
	private String alternateEmailAddress;
	private String password;
	private int defaultPasswordLength;
	private int mailboxCapacity;
	private Date createdAt;
	
	private final String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_-!@#$%";
	
	Email() {
		this("", "");
	}
	
	Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.companyDomain = "abc.com";
		this.defaultPasswordLength = 10;
		this.mailboxCapacity = 10;
		this.alternateEmailAddress = "";
		
		createdAt = new Date();
		
		// ask for the department and generate a random password
		setDepartment();
		generateEmailAddress();
		generatePassword(defaultPasswordLength);
	}
	
	private void setDepartment() {
		
		System.out.println("Enter Department Number: ");
		System.out.println("1: Sales\n2: Development\n3: Account\n0: None");
		
		Scanner in = new Scanner(System.in);
		String departmentNumber = in.nextLine();
		
		switch(departmentNumber) {
			case "1":
				department = "Sales";
				break;
			case "2":
				department = "Development";
				break;
			case "3":
				department = "Account";
				break;
			case "0":
			default:
				department = "";
		}
		
		in.close();
	}
	
	public String getDepartment() {
		return department;
	}
	
	/**
	 * format: firstname.lastname@department.company.com
	 * @return the generated email address
	 */
	public void generateEmailAddress() {
		StringBuilder br = new StringBuilder();
		br.append(firstName.toLowerCase()+".");
		br.append(lastName.toLowerCase()+"@");
		br.append(department.toLowerCase()+".");
		br.append(companyDomain);
		email = br.toString();
	}
	
	public String getEmailAddress() {
		return email;
	}
	
	public void setAlternateEmailAddress(String alternateEmailAddress) {
		this.alternateEmailAddress = alternateEmailAddress;
	}
	
	public String getAlternateEmailAddress() {
		return alternateEmailAddress;
	}
	
	public void generatePassword(int length) {
		StringBuilder pass = new StringBuilder(length);
		
		for(int i=0; i<length; i++) {
			int randomCharacter = (int) (Math.random() * passwordSet.length());
			pass.append(passwordSet.charAt(randomCharacter));
		}
		
		password = pass.toString();
	}
	
	public void changePassword(String pass) {
		password = pass;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setMailboxCapacity(int capacity) {
		mailboxCapacity = capacity;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public void showInfo() {
		StringBuilder br = new StringBuilder();
		
		br.append("Display Name: " + firstName + " " + lastName+"\n");
		br.append("Department: " + department+"\n");
		br.append("Email Address: " + email+"\n");
		br.append("Password: " + password+"\n");
		br.append("Alternate Email address: " + alternateEmailAddress+"\n");
		br.append("Time of creation: " + createdAt.toString()+"\n");
		
		System.out.println(br.toString());
	}
}
