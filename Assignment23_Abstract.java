//WAP in which super most class having 2CM, abstract class having 2AM&2CM, subclass having 2CM

package basicsprogram;
class class101
{
	void method101()
	{
		System.out.println("class with 2 concrete method--1");
	}
	void method102()
	{
		System.out.println("class with 2 concrete method--2");
	}
}
abstract class class102 extends class101
{
	abstract void method103();
	abstract void method104();
	void method105()
	{
		System.out.println("class with 2 concrete method & 2 Abstract method--1");
	}
	void method106()
	{
		System.out.println("class with 2 concrete method& 2 Abstract method--2");
	}

}

public class Assignment23_Abstract extends class102
{
	void method107()
	{
		System.out.println("sub-class with 2 concrete method--1");
	}
	void method108()
	{
		System.out.println("sub-class with 2 concrete method--2");
	}

	public static void main(String[] args) 
	{
		Assignment23_Abstract a23a = new Assignment23_Abstract();
		a23a.method101();
		a23a.method102();
		a23a.method103();
		a23a.method104();
		a23a.method105();
		a23a.method106();
		a23a.method107();
		a23a.method108();

	}	
	void method103() 
	{
		System.out.println("class with 2 concrete method & 2 Abstract method--1 IMplementaction");
		
	}	
	void method104() 
	{
		System.out.println("sub class with 2 concrete method & 2 Abstract method--2 Implementation");
		
	}

}
