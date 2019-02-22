package com.perscholas.NumManipulation;
import java.util.*;
public class NumManipulation {

	public static void main(String[] args) {
		int n1,n2,n3,sum,prod;
		double avg;
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner (System.in);
		Scanner num3 = new Scanner (System.in);
		System.out.println("Please Enter 3 whole numbers");
		n1 = num1.nextInt();
		n2 = num2.nextInt();
		n3 = num3.nextInt();
		
		sum = n1+n2+n3;
		prod = n1*n2*n3;
		avg = sum/3.0;
		
		System.out.println("The sum of the 3 numbers is "+ sum);
		System.out.println("The product of the 3 numbers is "+ prod);
		System.out.println("The average of the 3 numbers is "+ avg);
		
		
	}

}
