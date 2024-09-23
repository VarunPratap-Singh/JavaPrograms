
//Operators with static method by using method overloading concepts

package basicsprogram;

public class assignment3 {
	
	static void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println("Addition of 2 numbers "+sum);
	};
	static void addition(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("Addition of 3 numbers "+sum);
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(4,5);
		addition(2,6,78);

	}

}
