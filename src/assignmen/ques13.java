package assignmen;

public class ques13 {

	private static String ans;
	public static void main(String[] args) {
		java.util.Scanner fetch1=new java.util.Scanner(System.in);
		do {
		java.util.Scanner fetch=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int i= fetch.nextInt();
		if (i<0)
		System.out.println("The entered negative number is "+i+".");
		else 
		System.out.println("The entered number is positive.");
		System.out.println("");
		System.out.println("Do you want to continue? (Yes or No)");
		ans=fetch1.next();
		}while (ans.equals("Yes"));
		System.out.println("Thankyou");
		

	}

}
