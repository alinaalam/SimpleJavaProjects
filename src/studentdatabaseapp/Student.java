package studentdatabaseapp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {
	
	private String name;
	private int currentYear;
	private String studentID;
	private Set<String> enrolledCourses;
	private int balance;
	
	private static int pricePerCourse;
	private static int ID;
	private static HashMap<Integer, String> courses;
	
	Student(String name, int year) {
		
		this.name = name;
		this.currentYear = year;
		
		enrolledCourses = new HashSet<String>();
		
		generateUniqueID();
	}
	
	static {
		pricePerCourse = 600;
		ID = 1000;
		
		courses = new HashMap<Integer, String>();
		courses.put(1, "History 101");
		courses.put(2, "Mathematics 101");
		courses.put(3, "English 101");
		courses.put(4, "Chemistry 101");
		courses.put(5, "Computer Science 101");
	}
	
	private void generateUniqueID() {
		studentID = String.valueOf(currentYear) + String.valueOf(ID++);
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public void enroll() {
		
		String continueEnrollment = "y";
		Scanner in = new Scanner(System.in);
		
		while(continueEnrollment.equals("y")) {
			System.out.println("Please select a course to enroll in: ");
			for(Map.Entry<Integer, String> course : courses.entrySet()) {
				if(!enrolledCourses.contains(course.getValue())) {
					System.out.println(course.getKey() + ": " + course.getValue());
				}
			}
			
			int courseChosen = in.nextInt();
			in.nextLine();
			
			if(courses.containsKey(courseChosen)) {
				String course = courses.get(courseChosen);
				enrolledCourses.add(course);
			}
			
			System.out.println("To continue choosing more courses, please press 'y'");
			continueEnrollment = in.nextLine(); 
		}
		
		calculateBalance();
	}
	
	private void calculateBalance() {
		balance = pricePerCourse * enrolledCourses.size();
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void payTuition() {
		System.out.println("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		
		int payment = in.nextInt();
		in.nextLine();
		
		balance -= payment;
		System.out.println("Your remaining balance is $" + balance);
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Full Name: " + name + "\n");
		sb.append("Student ID: " + studentID + "\n");
		sb.append("Current year: " + currentYear + "\n");
		sb.append("Balance: " + balance + "\n");
		
		return sb.toString();
		
	}
}
