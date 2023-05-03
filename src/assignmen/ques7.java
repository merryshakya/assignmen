package assignmen;

public class ques7 {
	private static String ans;
	public static void main(String[] args) {
		java.util.Scanner fetch3=new java.util.Scanner(System.in);
		do {
		java.util.Scanner scanner= new java.util.Scanner(System.in);
		System.out.println("Choose one of the following:");
		System.out.println("1. Perimeter of circle");
		System.out.println("2. Perimeter of triangle");
		System.out.println("3. Perimeter of rectangle");
		int i= scanner.nextInt();
		switch(i){
		case 1:
			java.util.Scanner fetch=new java.util.Scanner(System.in);
			System.out.println("Enter the radius of circle");
			float r=fetch.nextFloat();
			float c=(float)(2*3.14*r);
			System.out.println("The perimeter of circle is "+c);
			break;
		case 2:
			java.util.Scanner fetch1=new java.util.Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		float b= fetch1.nextFloat();
		System.out.println("Enter one side of the triangle");
		float a=fetch1.nextFloat();
		System.out.println("Enter the other side of the triangle");
		float d= fetch1.nextFloat();
		float t= (float)(a+b+d);
		System.out.println("The perimeter of triangle is "+t);
		break;
		case 3:
			java.util.Scanner fetch2=new java.util.Scanner(System.in);
			System.out.println("Enter the length of the rectangle");
			float l=fetch2.nextFloat();
			System.out.println("Enter the breadth of the rectangle");
			float w=fetch2.nextFloat();
			float x=(float)(2*(l+w));
			System.out.println("The perimeter of the rectangle is "+x);
			break;
		}
		System.out.println("Do you want to continue? (Yes or No)");
		 ans =fetch3.next();
		}while (ans.equals("Yes"));
		System.out.println("Thank you!");
}
}
