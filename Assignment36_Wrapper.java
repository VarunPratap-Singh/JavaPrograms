//WAP to find out the alphabates char, digits, spaces, and special char from the given strings.
// Input = kv no 2 bangalore
//

package basicsprogram;

import java.util.Arrays;

public class Assignment36_Wrapper 
{
	static int count_of_alphabet,count_of_digit,count_of_space;

	public static void main(String[] args) 
	{
		String input= "kv no 2 bangalore";
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for (int i = 0; i < c1.length; i++) 
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				count_of_alphabet++;
			}
			boolean b2=Character.isDigit(c1[i]);
			if(b2==true)
			{
				count_of_digit++;
			}
			boolean b3=Character.isWhitespace(c1[i]);
			if(b3==true)
			{
				count_of_space++;
			}
		}
		System.out.println("Count of Alphabet in given input: "+count_of_alphabet);
		System.out.println("Count of digit in given input: "+count_of_digit);
		System.out.println("Count of space in given input: "+count_of_space);

	}

}
