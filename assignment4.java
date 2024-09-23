//Operators with Non Static  method by using method overloading concepts

package basicsprogram;

public class assignment4 {
	
	void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition of 2 numbers "+sum);
	};
	 void addition(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("Addition of 3 numbers "+sum);
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment4 a4 = new assignment4();
		a4.addition(8, 10);
		a4.addition(10, 20, 30);

	}

}
