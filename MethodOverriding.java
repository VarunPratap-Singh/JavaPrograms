package basicsprogram;

//WAP on Method Overriding

class Parent_Class1
{
	void login1()
	{
		System.out.println("Login with email");
		
	}

}
public class MethodOverriding extends Parent_Class1
{
	void login1()
	{
		System.out.println("Login with mobile");
		
		
	}

	public static void main(String[] args) 
	{
		MethodOverriding c1 = new MethodOverriding();
		c1.login1();
	}

}
