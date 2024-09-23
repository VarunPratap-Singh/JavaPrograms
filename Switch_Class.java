package basicsprogram;

import java.util.Scanner;

public class Switch_Class 
{

public static void main(String[] args)
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter your choice 1/2/3/4");
	int input =s1.nextInt();
		switch(input)
		{
			case 1: System.out.println("Launching Chrome Browser");
			break;
			case 2: System.out.println("Launching firefox Browser");
			break;
			case 3: System.out.println("Launching edge Browser");
			break;
			case 4: System.out.println("Launching Safari Browser");
			break;
			default:
				System.out.println("Your Selection is wrong , try again");
		}
		
		

}

}
