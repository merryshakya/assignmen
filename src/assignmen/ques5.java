package assignmen;

public class ques5 {

	public static void main(String[] args) {
		java.util.Scanner scanner= new java.util.Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		float r=scanner.nextFloat();
		System.out.println("Enter the length of the rectangle");
		float l=scanner.nextFloat();
		System.out.println("enter the breadth of the rectangle");
		float b= scanner.nextFloat();
		System.out.println("enter the base of the triangle");
		float base= scanner.nextFloat();
		System.out.println("enter the height of the triangle");
		float h= scanner.nextFloat();
		float circle= (float) 3.14*(r*r);
		float rectangle= (float) l*b;
		float triangle= (float)(base*h)*1/2;
		System.out.println("The area of the circle is "+circle);
		System.out.println("The area of the rectangle is "+rectangle);
		System.out.println("The area of the triangle is "+triangle);

	}

}
