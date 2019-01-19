# SimpleJavaProjects
Contains a list of simple Java projects made while watching Udemy course

Link to course: https://www.udemy.com/practice-java-by-building-projects/

# List of projects:

# Email Generator Program
 Scenario: You're an IT Support Administrator and are charged with the task of creating email accounts for new hires
 This application should do the following:
 * Generate an email with the following syntax: firstname.lastname@department.company.com
 * Determine the department(sales, development, accounting), if none leave blank
 * Generate a random string for password
 * Have set methods to change the password, set the mailbox capacity and define an alternate email address
 * Have get methods to display the name, email and mailbox capacity
 
 # Student Database Program
 Scenario: You are a Database Administrator for a university and need to create an application to manage student enrollments and balance. The application should do the following:
 * Ask the user how many new students will be added to the database
 * The user should be prompted to enter the name and year for each student
 * The student should have a 5-digit unique ID, which the first number being their grade level 
 * A student can enroll in the following courses:
    * History 101
    * Mathematics 101
    * English 101
    * Chemistry 101
    * Computer Science 101
 * Each course costs $600 to enroll
 * The student should be able to view their balance and pay the tuition
 * To see the status of the student, we should see their name, ID, courses enrolled and balance
 
 # Bank Account Program
 Scenario: You are a back end developer and need to create an application
 to handle new customer bank account requests. The application should do the following:
 * Read a .csv file of names, social security numbers, account types and initial deposit
 * Use a proper data structure to hold all these accounts
 * Both savings and checking accounts share the following properties:
    * deposit()
    * withdraw()
    * transfer()
    * showInfo()
    * 11-Digit Account Number (generated with the following process: 1 or 2 depending on Savings  or Checking, 
    last two digits of SSN, unique 5-digit number and random 3 digit number)
 * Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
 * Checking Account holders are assigned a Debit Card with a 12-digit number and a 4-digit PIN
 * Both accounts will use an interface that determines the base interest rate
    * Savings account will use .25 points less than the base rate
    * Checking accounts will use 15% of the base rate
 * The ShowInfo method should reveal relevant account information as well as information specific to the Checking Account or Saving Account
