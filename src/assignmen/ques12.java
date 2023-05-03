package assignmen;

public class ques12 {

	private static String name;
	private static String nt;

	public static void main(String[] args) {
	java.util.Scanner fetch= new java.util.Scanner(System.in);
	System.out.println("Enter your name");
	name=fetch.next();
	System.out.println("Enter your roll number");
	int r=fetch.nextInt();
	System.out.println("Enter your nationality");
	nt=fetch.next();
	
	System.out.println();
	System.out.println("Hello "+name+",your roll number is "+r+" and your nationality is "+nt+".");
		

	}

}
