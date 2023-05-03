package assignmen;

import java.util.Scanner;

public class ques11 {

	public static void main(String[] args) {
		java.util.Scanner fetch= new java.util.Scanner(System.in);
		System.out.println("Enter the first integer value for x");
		int x= fetch.nextInt();
		System.out.println("Enter the second integer value for y");
		int y= fetch.nextInt();
		System.out.println("Before swapping:");
		System.out.println("The value of x is "+x);
		System.out.println("The value of y is "+y);
		
		//using temp variable
		swap(x,y);
		
	}

	private static void swap(int x, int y) {
		int tempvalue= x;
		x=y;
		y=tempvalue;
		
		System.out.println("After swapping");
		System.out.println("The value of x is "+x);
		System.out.println("The value of y is "+y);

	
	//without using temp variable
	    x=x+y;
		y=x-y;
		x=x-y;
		System.out.println();
		System.out.println("Again, without using the temp variable");
		System.out.println("The swapped value of x is "+x);
		System.out.println("The swapped value of y is "+y);
		
		
	}

}
