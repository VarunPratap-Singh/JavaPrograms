package basicsprogram;

public class Class22_Palindrome {

	public static void main(String[] args) 
	{
		String input= "madam";
		String output="";
		int l = input.length();
		System.out.println("Length = "+l);
		
		for(int i=l-1; i>=0; i--)
		{
			char c1=input.charAt(i);
			//System.out.println(c1);
			output = output+c1;
		}
		System.out.println("Input String = "+input);
		System.out.println("Output String = "+ output);
		if(input.equals(output))
		{
			System.out.println("entered value is palindrome");
		}
		else
		{
			System.out.println("Entered value is not palindrome");
		}

	}

}
