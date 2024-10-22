//WAP where the your name is like "RAM" and print the output like:
//R
//A
//M
//And Print the second output as like:
//M
//A
//R
package basicsprogram;

public class Assignment49 {

	public static void main(String[] args) 
	{
		String name="Varun";
		char c1[]=name.toCharArray();
		for (int i = 0; i < name.length(); i++) 
		{
			System.out.println(c1[i]);
		}
		System.out.println("***********");
		for (int i = c1.length-1; i >= 0; i--)
		{
			System.out.println(c1[i]);
		}

	}

}
