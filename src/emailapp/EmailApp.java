package emailapp;

/**
 * Scenario: You're an IT Support Administrator and are charged with the task of
 * creating email accounts for new hires
 * This application should do the following:
 * Generate an email with the following synatx: firstname.lastname@department.company.com
 * Determine the department(sales, development, accounting), if none leave blank
 * Generate a random string for password
 * Have set methods to change the password, set the mailbox capacity and define an alternate email address
 * Have get methods to display the name, email and mailbox capacity
 * @author alinaalam
 *
 */
public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email emailObj1 = new Email("John", "Doe");
		emailObj1.showInfo();
	}

}
