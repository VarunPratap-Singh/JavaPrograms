package basicsprogram;

import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter side of Square =");
		int s=s1.nextInt();
		int area= s*s;
		System.out.println("Area of Square is "+area);
		

	}

}
