package com.perscholas.gradingmarks;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		
		Scanner inputMarks = new Scanner(System.in);
		System.out.println("Enter your marks-");
		int marks = inputMarks.nextInt();
		String grade;
		
		/*Using simple if else statements
		 * 
		 * if (marks >=90 && marks <100)
				
				System.out.println("You got Grade :A");	
		else if (marks >=80 && marks <90)
			 
			System.out.println("You got Grade :B");	
		else if (marks >=70 && marks <80)
			 
			System.out.println("You got Grade :C");	
		else if (marks >=70 && marks <70)
			
			System.out.println("You got Grade :D");	
		else
			System.out.println("You need to work harder!!!");*/
		
		//Using switch case
		
		switch ( (marks<100 && marks >=90)? 0:
				 (marks<90 && marks >=80)? 1:
				 (marks<80 && marks >=70)? 2:
				 (marks<70 && marks >=60)? 3:4)
		{
		case 0: 			
				System.out.println("You got Grade :A");
				break;
		case 1: 			
				System.out.println("You got Grade :B");
				break;
		case 2:
			System.out.println("You got Grade :B");
			break;
		case 3: 
			System.out.println("You got Grade :C");
			break;
		case 4:
			System.out.println("Student score is invalid");
		default : 
			System.out.println("You failed !!!");
			break;		
		}
		
		
		
		
	}

}
