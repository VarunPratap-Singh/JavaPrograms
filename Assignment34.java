//WAP where the size of the array is 4, and check whether a given value (such as 50) is a part of the array or not.
package basicsprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment34
{

	public static void main(String[] args)
	{
		int rollno[]=new int[4];
		Scanner s1= new Scanner(System.in);
		for (int i = 0; i < rollno.length; i++)
		{
			System.out.println("enter roll no :");
			rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));

	}

}
