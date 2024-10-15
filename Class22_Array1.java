 package basicsprogram;

import java.util.Iterator;

public class Class22_Array1 
{
	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=01;
		rollno[1]=02;
		rollno[2]=03;
		rollno[3]=04;
		for (int i = 0; i < rollno.length-1; i++) 
		{
			System.out.println("Roll no : "+rollno[i]);
		}
		
		String name[]=new String[3];
		name[0]="varun";
		name[1]="Pratap";
		name[2]="Singh";
		for (int i = 0; i <=name.length; i++) 
		{
			System.out.println("Name : "+name[i]);
		}
		
				
	}

}
