package assignmen;

public class ques14 {

	private static String ans;

	public static void main(String[] args) {
		java.util.Scanner fetch= new java.util.Scanner(System.in);
		System.out.println("Enter the first integer value");
		int a=fetch.nextInt();
		System.out.println("Enter thr second integer value");
		int b=fetch.nextInt();
		if (a==b) {
		System.out.println("The first value "+a+" == "+"The second value "+b);}
		else if (a<b) {
		System.out.println("The first value "+a+" < "+"The second value "+b);}
		else {
		System.out.println("The first value "+a+" > "+"The second value "+b);}
		

	}

}
