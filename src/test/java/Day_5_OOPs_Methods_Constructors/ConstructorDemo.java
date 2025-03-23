package Day_5_OOPs_Methods_Constructors;

public class ConstructorDemo {
	int x, y;

	ConstructorDemo()// default constructor
	{
		x = 100;
		y = 200;
	}

	ConstructorDemo(int a, int b) // parameterized constructor
	{
		x = a;
		y = b;

	}

	void sum() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
	// ConstructorDemo cd= new ConstructorDemo();//invoke default constructor
		ConstructorDemo cd = new ConstructorDemo(10, 20);// parameterized constructor
		cd.sum();

	}
}
