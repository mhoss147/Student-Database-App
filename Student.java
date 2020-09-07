package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
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
	//	System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
			
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
		 
		 do {
			 
			System.out.print("Enter course to enroll (press Q to exit): ");
			 
			 Scanner in = new Scanner(System.in);
			 String course = in.nextLine();
			 if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			 }
		 
			 else { 
				 break; }
		} while (1 != 0);
		 
//	System.out.println("ENROLLED IN: " + courses);
		 
	 }
	
	
	// View balances and 
	 
	 public void viewBalance() {
		 
		 System.out.println("YOUR BALANCE IS: $" + tuitionBalance);
	 }
	 
	 
	 
	// Pay tuition
	 
	 public void payTuition() {
		 
		 System.out.print("Enter your payment: $");
		 Scanner in = new Scanner(System.in);
		 int payment = in.nextInt();
		         
		 tuitionBalance = tuitionBalance - payment;		
		 
		 System.out.println("Thank you for your payment of $: " + payment);
		 
		 viewBalance();
	}
	 
	
	
	// Show status of the students with...
	 public String showInfo() {
		 return "Name: " + firstName + " " + lastName +
				 "\nGrade Level: " + gradeYear + 
				 "\nStudent ID: " + studentID +
				 "\nCourses Enrolled: " + courses + 
				 "\nBalance: $" + tuitionBalance;
	 }

}
