//Write a array program to update the array value.

package basicsprogram;

public class Assignment30_ArrayValueUpdate 
{

	public static void main(String[] args) 
	{
		int roll[]={10,20,30,40};
		for (int i = 0; i < roll.length; i++) 
		{
			System.out.println("value at index : "+i+" = "+roll[i]);
		}
		roll[0]= 11;
		roll[1]= 22;
		roll[2]= 33;
		roll[3]= 44;
		for (int i = 0; i < roll.length; i++) 
		{
			System.out.println("Updated value at index : "+i+" = "+roll[i]);
		}

	}

}
