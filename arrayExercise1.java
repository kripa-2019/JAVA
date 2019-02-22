package com.perscholas.array;
import java.util.Arrays;
public class arrayExercise1 {

	public static void main(String[] args) {
		String[] colors = {"red","green","blue","yellow"};
		System.out.println("Length: "+colors.length);
		String[] duplicate = colors.clone();
		System.out.println("Length of duplicate "+duplicate.length);
		System.out.println(Arrays.toString(duplicate));
	}

}
