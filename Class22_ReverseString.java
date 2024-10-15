package basicsprogram;

public class Class22_ReverseString {

	public static void main(String[] args) 
	{
		String input= "Automation";
		String output="";
		int l = input.length();
		System.out.println("Length = "+l);
		
		for(int i=l-1; i>=0; i--)
		{
			char c1=input.charAt(i);
			//System.out.println(c1);
			output = output+c1;
		}
		System.out.println(output);
		

	}

}
