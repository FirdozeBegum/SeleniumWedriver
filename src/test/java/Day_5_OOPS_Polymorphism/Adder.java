package Day_5_OOPS_Polymorphism;

public class Adder {

	int a = 10, b = 20;

	void sum() // 1. Method name should be same

	{
		System.out.println(a + b);
	}

	void sum(int x, int y) // 2. number of parameters should be different
	{
		System.out.println(x + y);
	}

	void sum(int x, double y) // 3. Data type of parameter should be different
	{
		System.out.println(x + y);
	}

	void sum(double x, int y )      // 4. Order of parameter should be different
	{
		System.out.println(x+y);
	}
	
	
	
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	
	
	
	
}
