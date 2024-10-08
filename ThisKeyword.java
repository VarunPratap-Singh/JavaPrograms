package basicsprogram;
 //WAP on parameterized and non-parameterized this calling statement in java

public class ThisKeyword {
	ThisKeyword()
	{
		this(1);
		System.out.println("No Parameter");
	}
	ThisKeyword(int a)
	{
		this("varun");
		System.out.println("1 Parameter");
	}
	ThisKeyword(String a)
	{
		this(10, "VPS");
		System.out.println("1 String Parameter");
	}
	ThisKeyword(int a, String b)
	{
		System.out.println("1 String & 1 Int Parameter");
	}

	public static void main(String[] args)
	{
		new ThisKeyword();
	

	}

}
