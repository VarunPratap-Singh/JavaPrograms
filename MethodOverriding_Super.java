// WAP on Method Overriding using super keyword in java


package basicsprogram;
class Parent_Class2
{
	void login2()
	{
		System.out.println("Login with email");
		
	}

}
public class MethodOverriding_Super extends Parent_Class2
{
	void login2()
	{
		System.out.println("Login with mobile");
		super.login2();
		
	}

	public static void main(String[] args) 
	{
		MethodOverriding_Super c1 = new MethodOverriding_Super();
		c1.login2();
	}

}
