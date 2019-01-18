package studentdatabaseapp;

import java.util.Scanner;

/**
 * Scenario: You are a Database Administrator for a university and need to create an application
 * to manage student enrollments and balance
 * The application should do the following:
 * 1) Ask the user how many new students will be added to the database
 * 2) The user should be prompted to enter the name and year for each student
 * 3) The student should have a 5-digit unique ID, which the first number being their grade level 
 * 4) A student can enroll in the following courses:
 * History 101
 * Mathematics 101
 * English 101
 * Chemistry 101
 * Computer Science 101
 * 5) Each course costs $600 to enroll
 * 6) The student should be able to view their balance and pay the tuition
 * 7) To see the status of the student, we should see their name, ID, courses enrolled and balance
 * @author alinaalam
 *
 */
public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("How many students do you want to enroll?");
			int numberOfStudents = in.nextInt();
			in.nextLine();
			
			Student[] studentsEnrolled = new Student[numberOfStudents];
			
			for(int i=0; i<numberOfStudents; i++) {
				
				System.out.println("STUDENT INFORMATION:");
				System.out.println("Full name of the student: ");
				String name = in.nextLine();
				
				System.out.println("Year of the student: ");
				System.out.println("1: Freshman\n2: Sophomore\n3: Junior\n4: Senior");
				int year = in.nextInt();
				in.nextLine();
				
				Student newStudent = new Student(name, year);
				newStudent.enroll();
				newStudent.payTuition();
				
				studentsEnrolled[i] = newStudent;
			}
			
			for(Student student : studentsEnrolled) {
				System.out.println(student);
			}
			
		} catch(Exception e) {
			System.out.println("Please give a valid positive integer");
			e.printStackTrace();
		} finally {
			in.close();
		}
	}

}
