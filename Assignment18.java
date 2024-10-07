package basicsprogram;

//WAP on Parameterised super calling statement (within multiple class)

class Reporting1
{
	Reporting1(String a)
	{
		System.out.println("Reporting1 " + a);
	}
	
}
class Screenshot1 extends Reporting1
{
	Screenshot1(int a, int b)
	{
		super("Varun");
		System.out.println("Screenshot1 " + a + " " + b);
	}
	
}
public class Assignment18 extends Screenshot1 
{
	Assignment18()
	{
		super(10,20);
		System.out.println("Assignment 18");
	}

	public static void main(String[] args) 
	{
		new Assignment18();

	}

}
