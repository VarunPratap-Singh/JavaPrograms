//WAP from the given string input replace all the alphabets with Nothing.
//Example: String name= "kv no 2";
package basicsprogram;

public class Assignment41_replace4 {

	public static void main(String[] args)
	{
		String n1="kv no 2";
		String n2=n1.replaceAll("[a-z]", "");
		System.out.println(n2);
	}

}
