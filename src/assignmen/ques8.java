package assignmen;

public class ques8 {
	public static void main(String[] args) {
		java.util.Scanner fetch= new java.util.Scanner(System.in);
		System.out.println("Enter the radius of the cylinder");
		float r= fetch.nextFloat();
		System.out.println("Enter the height of the cylinder");
		float h= fetch.nextFloat();
		float v=(float)(3.14*(r*r)*h);
		System.out.println("The volume of the cylinder is "+v);

}
}