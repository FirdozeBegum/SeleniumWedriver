package Day1;

public class LargestOf3Numbers {
	/*
	  a>b and a>c ---a is largest
	   b>a and b>c -- b is largest 
	   c>a and c>b -- is
	  largest combination of logical and relational operators
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 200, c = 300;
		if (a > b && a > c) {
			System.out.println("a is a largest number "+ a);
		} else if (b > a && b > c) {
			System.out.println("b is a largest number "+b);
		}

		else {
			System.out.println("c is a largest number "+c);
		}

	}
}
