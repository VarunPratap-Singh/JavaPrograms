package basicsprogram;

import java.util.Scanner;

public class Assignment29_ArrayDuplicateValue 
{

	public static void main(String[] args) 
	{
		int marks[]= new int[4];
		for (int i = 0; i < marks.length; i++) 
		{
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter marks in Subject "+i+" : " );
			int s= s1.nextInt();
			marks[i]=s;
		}
		for (int i = 0; i < marks.length; i++)
		{
			System.out.println("Marks in Subject "+i+" : " +marks[i]);
		}
		
		for (int i = 0; i < marks.length-1; i++)
		{
			for (int j = i+1; j < marks.length; j++) {
				if(marks[i]==marks[j])
				{
					System.out.println("array has duplicate value at index : "+i+" & "+j);
					
				}
//				else
//				{
//					System.out.println("Array does not have a duplicate value at index : "+i+" & "+j);
//				}
					
				
			}
		}
		

	}

}
