package com.perscholas.array;

import java.util.Arrays;

public class arraySort {

	public static void main(String[] args) {
		
				
		int [] myArray = {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
		
		int arrLength = myArray.length;
		int temp;
		
		for (int i = 0;i<arrLength;i++) {
			
			temp = myArray[i];
			for (int j = 0; j < arrLength-1;j++) {
				
				if(myArray[j]>myArray[j+1]) {
				
					temp = myArray[j+1];
					myArray[j+1] = myArray[j];
					myArray[j]= temp;
				}
				
		}
					
		
		}
		
		System.out.println("The sorted array is: "+Arrays.toString(myArray));
		//System.out.println(myArray);
		//System.out.println(myArray[0]);
	}

}
