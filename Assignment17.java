package basicsprogram;

//WAP on non parametrized super calling statement (within multiple class)
class Reporting3
{
	Reporting3()
	{
		System.out.println("Reporting3 ");
	}
	
}
class Screenshot3 extends Reporting3
{
	Screenshot3()
	{
		super();
		System.out.println("Screenshot3 ");
	}
	
}
public class Assignment17 extends Screenshot3 
{
	Assignment17()
	{
		System.out.println("Assignment 17");
	}
	public static void main(String[] args) {
		new Assignment17();
	}

}
