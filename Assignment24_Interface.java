//WAP on multiple level inheritance using Interface


package basicsprogram;
interface interface1
{
	abstract void method16();

}
interface interface2
{
	abstract void method17();

}
public class Assignment24_Interface implements interface1, interface2
{

	public static void main(String[] args) 
	{
		Assignment24_Interface a24i= new Assignment24_Interface();
		a24i.method16();
		a24i.method17();

	}

	
	public void method17() 
	{
		System.out.println("Interface2 method");		
	}
	
	public void method16() 
	{
		System.out.println("Interface2 method")	;	
	}

}
