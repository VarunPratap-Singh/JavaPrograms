package basicsprogram;

 class class5
{
	void class5method()
	{
		System.out.println("Super Class- class5");
	}
}
 class class4 extends class5
{
	 void class4method()
		{
			System.out.println("Sub Class- class4");
		}
}
 class class3 extends class4
{
	static void class3method()
	{
		System.out.println("Sub Class- class3");
	}
}
class class2 extends class3
{
	static void class2method()
	{
		System.out.println("Sub Class- class2");
	}
}


public class Assignment16 extends class2
{

	public static void main(String[] args) 
	{
		class5 c5 = new class5();
		class4 c4 = new class4();
		c5.class5method();
		c4.class4method();
		class3.class3method();
		class2.class2method();

	}

}
