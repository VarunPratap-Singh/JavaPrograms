package basicsprogram;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter length of Rectangle =");
		int a=s1.nextInt();
		System.out.println("Enter breadth of Rectangle =");
		int b=s1.nextInt();		
		int area= a*b;
		System.out.println("Area of Rectangle is "+area);

	}

}
