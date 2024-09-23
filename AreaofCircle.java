package basicsprogram;

import java.util.Scanner;

public class AreaofCircle
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of radius: ");
		int radius= s1.nextInt();
		System.out.println("Enter value of pi: ");
		double pi = s1.nextDouble();
		Double area= pi*radius*radius;
		System.out.println("Are of circle ="+area);

	}

}
