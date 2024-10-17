
//Write a program to accept the array at runtime.


package basicsprogram;

import java.util.Scanner;

public class Assignment33_ArrayAtRunTime {

	public static void main(String[] args) 
	{
		int marks[]=new int[5];
		
		Scanner s1=new Scanner(System.in);
		for (int i = 0; i < marks.length; i++) 
		{
			System.out.println("Enter marks fur user "+i);
			marks[i]=s1.nextInt();
		}
		for (int i = 0; i < marks.length; i++) 
		{
			System.out.println("Entered marks at "+i+" index = "+ marks[i]);
		}

	}

}
