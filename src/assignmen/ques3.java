package assignmen;

public class ques3 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter the first number");
		float num1= scanner.nextFloat();
		System.out.println("Enter the second number");
		float num2= scanner.nextFloat();
			float sum = num1 + num2;
			float average= sum/2;
		System.out.println("The first number is "+num1+"and the second number is "+num2);
		System.out.println("Their sum is "+sum);
		System.out.println("Their average is "+average);


	}

}
