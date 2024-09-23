package basicsprogram;

import java.util.Scanner;

public class CircumferenceofCircle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Radius of Circle :");
		int r= s1.nextInt();
		System.out.println("Enter value of pi :");
		double pi=s1.nextDouble();
		double circum=2*pi*r;
		System.out.println("Circumferebce of Circle is : "+circum);}

}
