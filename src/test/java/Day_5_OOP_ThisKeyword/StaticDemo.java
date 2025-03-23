package Day_5_OOP_ThisKeyword;

public class StaticDemo {
	static int a = 10;// static variables
	int b = 20;    // non static variables
	static void m1()
	{
		System.out.println("this is m1 static method...");
	}
	void m()  // non- static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}
	
	void m2() // non-static method
	{
		System.out.println("this is m2 non-static method...");
	}
	/*public static void main(String[] args) {
		//1) static methods can access static stuff directly (without object)
		
		
		StaticDemo sd= new StaticDemo();
		System.out.println(a);
		m1();
		//System.out.println(b);	cannot access, b is non- static 
		//m2(); // cannot access, m2() is non- static
	
	
	sd.m2();
	}*/

}
