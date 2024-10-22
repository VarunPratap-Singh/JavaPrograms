

package basicsprogram;

public class Assignment44_45_46_47_48_replaceAll6 {

	public static void main(String[] args)
	{
		//Assignment44
		String name="cat";
		boolean b1=name.matches("...");
		System.out.println(b1);
		
		//Assignment45
		//check if the input starts with C
		String a="cat";
		boolean b2=a.matches("c(.*)");
		System.out.println(b2);
		
		//Assignment46
		//check if the input ends with t
		boolean b3=a.matches("(.*)t");
		System.out.println(b3);
		
		//Assignment47
		//check if n is present or not in "Varun" or not
		String s2="Varun";
		boolean b4=s2.matches("(.*)n(.*)");
		System.out.println(b4);
		
		//Assignment48
		//replace all the spaces with _
		//Varun pratap Singh
		String s3="Varun Pratap Singh";
		String s4=s3.replaceAll(" ", "_");
		System.out.println(s4);
		
	}

}
