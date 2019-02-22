package com.perscholas.evenodd;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
			int i;
			
			Scanner inputNo = new Scanner(System.in);
			System.out.println("enter a number to find if its even or odd-");
			i = inputNo.nextInt();
			if ((i  % 2) ==0 )
					 System.out.println(i+" is a even number");
			
			else
				System.out.println(i+" is an odd number");
			
		
	}
	
	

}
