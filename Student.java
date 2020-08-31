package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	
	
	
	// Constructor: Prompt user to enter student's name and year
	
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freeshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter class year: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
			
	}
	
	// Generate an ID
	
	private void setStudentID() {
		
		id++;
		
		// Grade level + ID
		
		this.studentID = gradeYear + "" + id;
		
		
	}
	
	
	// Enroll in courses
	
	 public void enroll() {
		 
		 // Get inside a loop, user 0 to quit
		 
		 System.out.println("Enter course to enroll (press 0 to exit): ");
		 
		 Scanner in = new Scanner(System.in);
		 String course = in.nextLine();
		 if (course != "Q") {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		 
		 System.out.println("ENROLLED IN: " + courses);
		 System.out.println("TUITION BALANCE: " + tuitionBalance);
		 
	 }
	
	
	// View balances and pay tuition
	
	
	// Show status of the students with...

}
