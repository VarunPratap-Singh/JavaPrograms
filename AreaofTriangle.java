package basicsprogram;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value of base :");
		double b=s1.nextDouble();	
		System.out.println("Enter value of height :");
		double h=s1.nextDouble();	
		double area= .5*b*h;
		System.out.println("Are of Traingle ="+area);


	}

}
