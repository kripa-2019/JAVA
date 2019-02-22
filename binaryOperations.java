package com.perscholas.binary;
import java.util.*;

public class binaryOperations {

	public static void main(String[] args) {
			
			int i,j;
			int[] k = new int[1000000];
			Scanner inputNum = new Scanner(System.in);
			System.out.println("Enter a number greater than 2: ");
			int decimal = inputNum.nextInt();
			int count = 0;
			i = decimal;
			
			while (decimal>0) {
								
				j = decimal%2;
				k[count] = j;
				count++;
				decimal = decimal/2;
								
															
			}
			
			System.out.println("The binary of "+ i +"  is:");
			//Printing the array in reverse order			
			for( int x=count-1; x>=0; x-- ) {
				
				
				
				System.out.print(k[x]);//using print instead of println to see the nos in binary
			}
					
		

	}

}
