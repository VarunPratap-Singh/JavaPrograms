
//Write a program to check whether the two given arrays are equal or not.

package basicsprogram;

import java.util.Arrays;

public class Class23_ArrayAreEquals 
{
	public static void main(String[] args)
	{
		int no1[] =new int[3];
		no1[0]=78;
		no1[1]=89;
		no1[2]= 96;
		int no2[] =new int[3];
		no2[0]=78;
		no2[1]=89;
		no2[2] =96;
		
		boolean b1=Arrays.equals(no1, no2);
		System.out.println(b1);
		if(b1)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
	}

}
