package basicsprogram;
class One //super class
{
	static void add()
	{
		System.out.println("add");
	}
	static void sub()
	{
		System.out.println("sub");
	}
	
}
public class Inheritance1 extends One //sub class
{
	static void div()
	{
		System.out.println("div");
	}
	static void mul()
	{
		System.out.println("mul");
	}
	

public static void main(String[] args)
{
	div();
	mul();
	add();
	
}

}
