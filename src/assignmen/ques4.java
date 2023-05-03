package assignmen;

public class ques4 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the principal");
		float P =scanner.nextFloat();
		System.out.println("Enter the interest rate");
		float R =scanner.nextFloat();
		System.out.println("Enter the time in years");
		float T=scanner.nextFloat();
		float SI=(P*T*R)/100;
		System.out.println("The simple interest for entered values is "+SI);

	}

}
