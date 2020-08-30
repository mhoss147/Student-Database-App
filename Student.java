package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
	private int costOfCourse = 600;
	private int tuitionBalance;
	
	
	
	
	// Constructor: Prompt user to enter student's name and year
	
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freeshman\n2 - Sophmore\3 - Junior\n4 - Senior\nEnter class year: ");
		this.gradeYear = in.nextInt();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		
		
	}
	
	// Generate an ID
	
	
	// Enroll in courses
	
	
	// View balances and pay tuition
	
	
	// Show status of the students with...

}
