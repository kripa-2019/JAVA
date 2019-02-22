package com.perscholas.palindrome;
import java.util.*;

public class GeneratePalindromes {

	public static void main(String[] args) {
		
		int num,reversedNum = 0, remainder,lo,high;
		ArrayList  <Integer> palindrome = new ArrayList<>();
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter low range ");
		lo = inputNum.nextInt();
		System.out.println("Enter upper limit");
		high = inputNum.nextInt();
		inputNum.close();
        
		for(int i = lo;i<=high;i++) {
			num = i;	
			while (num!=0) {
				
				remainder = num%10;
				reversedNum = reversedNum*10+remainder;
				num /= 10;		
				
			}
			
			if(i == reversedNum) {
				palindrome.add(i);
			}
			reversedNum = 0;
			
		}
    
   	System.out.println(palindrome);
		
	}

}
