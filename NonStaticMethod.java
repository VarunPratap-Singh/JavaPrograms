package basicsprogram;

public class NonStaticMethod 
{
	void addition()
	{
		int a=20;
		int b=10;
		int add = a+b;
		System.out.println("Adding 2 Numbers "+ add);
	}
	void substraction()
	{
		int a=20;
		int b=10;
		int sub = a-b;
		System.out.println("Substraction 2 Numbers "+sub);
	}
	void multiplication()
	{
		int a=20;
		int b=10;
		int mul = a*b;
		System.out.println("Multiplication 2 Numbers "+mul);
	}
	void divide()
	{
		int a=20;
		int b=10;
		int div = a/b;
		System.out.println("division 2 Numbers "+div);
	}
	void mod()
	{
		int a=20;
		int b=10;
		int mod = a%b;
		System.out.println("Modulus 2 Numbers "+ mod);
	} 

	public static void main(String[] args) 
	{
		NonStaticMethod n1=new NonStaticMethod();
		n1.addition();
		System.out.println("My Main Method");
		n1.substraction();
		n1.divide();
		n1.mod();
		n1.multiplication();

	}

}
