package assignmen;

import java.util.Scanner;

public class ques16 {
	private static String ans;

	public static void main(String[] args) {
		Scanner fetch1=new Scanner(System.in);
		do {
		Scanner fetch =new Scanner(System.in);
		System.out.println("Enter a number");
		float num= fetch.nextFloat();
		if ((num%2)==0){
		System.out.println("The entered number "+num+" is even.");
		}
		else{
		System.out.println("The entered number "+num+" is odd.");
		}
		System.out.println("Do you want to continue? (Yes or No)");
		ans =fetch1.next();}
		while (ans.equals("Yes"));
		System.out.println("Thank you!!");
	}

}
