package assignmen;

public class ques9 {

		private static String ans;

		public static void main(String[] args) {
			java.util.Scanner fetch3= new java.util.Scanner(System.in);
			do {
			java.util.Scanner fetch=new java.util.Scanner(System.in);
			System.out.println("Choose one of the following:");
			System.out.println("1. Fahrenheit to Celcius");
			System.out.println("2. Celcius to Fahrenheit");
			int i= fetch.nextInt();
			switch(i) {
			case 1:
				java.util.Scanner fetch1=new java.util.Scanner(System.in);
				System.out.println("Enter the temperature in Fahrenheit");
				float f= fetch1.nextFloat();
				float c= ((f-32)*5/9);
				System.out.println("The temperature in celcius is "+c+".");
				break;
			case 2:
				java.util.Scanner fetch2 =new java.util.Scanner(System.in);
				System.out.println("Enter the temperature in Celcius");
				float a= fetch2.nextFloat();
				float b= (a*(9/5)+32);
				System.out.println("The temperature in Fahrenheit is "+b+".");
				break;
			}
			System.out.println("");
	System.out.println("Do you want to continue? (Yes or No)");
	ans= fetch3.next();
	}while (ans.equals("Yes"));
			System.out.println("");
			System.out.println("Thank you!!");

	}

}
