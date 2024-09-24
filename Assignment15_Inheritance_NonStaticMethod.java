package basicsprogram;
class SuperClass //super class
{
	 void add()
	{
		System.out.println("add");
	}
	 void sub()
	{
		System.out.println("sub");
	}
	
}
public class Inheritance_NonStaticMethod extends SuperClass //sub class
{
	 void div()
	{
		System.out.println("div");
	}
	 void mul()
	{
		System.out.println("mul");
	}
	

public static void main(String[] args)
{
	Inheritance_NonStaticMethod s1 = new Inheritance_NonStaticMethod();
	s1.add();
	s1.sub();
	s1.mul();
	s1.div();
}

}
