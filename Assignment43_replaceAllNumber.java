//WAP from the given string input replace all the entire numerics with Nothing.
//
//Example: String name= "My home is near to sector 2 Patna 4";AA

package basicsprogram;

public class Assignment43_replaceAllNumber {

	public static void main(String[] args) 
	{
		String n1="My home is near to sector 2 Patna 4";
		String n2=n1.replaceAll("[0-9]", "");
		System.out.println(n2);

	}

}
