//WAP to check the given two  strings are anagram or not.
package basicsprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment35_Anagram {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		String word1,word2;
		System.out.println("Enter String first string : ");
		word1=s1.next();
		System.out.println("Enter String second string : ");
		word2=s1.next();
		System.out.println("First String is "+word1);
		System.out.println("Second String is "+word2);
		if(word1.length()!=word2.length())
		{
			System.out.println("Strings are not anagram");
		}
		else
		{
			char[] c1=word1.toCharArray();
			char[] c2=word2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("Sorted array of First String is "+Arrays.toString(c1));
			System.out.println("Sorted array of Second String is "+Arrays.toString(c2));
			boolean b1= Arrays.equals(c1, c2);
			if(b1==true) 
			{
				System.out.println("Strings are anagram");
			}
			else	
			{
				System.out.println("Strings are not anagram");
			}
		}
		
	}

}
	
