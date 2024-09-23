package basicsprogram;
public class Global_variable
{
	static int a=100; //global variable
	int b=90; //global variable
	static double pi;

	public static void main(String[] args)
	{
		int c= 90; // local variable
		System.out.println(c+a);
		System.out.println(pi);

	}

}
