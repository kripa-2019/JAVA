package com.perscholas.fibseries;

import java.util.Scanner;

public class DisplaySeries {
	
	public static void main(String[] args) {
		
		
		int i;
		int num1=0;
		int num2=1;
		int sum=0;
		// when u say NEW clas_name, u are constructing the class.here it takes arguments
		Scanner seriesLgt = new Scanner(System.in);
		
		System.out.println("enter a number for max length of series ");
		//reading the length of series
		int n = seriesLgt.nextInt();
		seriesLgt.close();
		
		System.out.println("The length is:" + n +"\n");
		System.out.println("The Fibonacci series ");
		
		for (i=1;i<=n;i++) {
			
			System.out.println(num1);
			sum = num1+num2;
			num1=num2;
			num2= sum;
			//System.out.println(num2);
			//System.out.println(sum);
			
		}
		
		
		
		
	}

}
