package Day_8_ExceptionHandling;

import java.util.Scanner;

public class Exceptions_Demo {
			// Un-Checked Exceptions
	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		Scanner sc= new Scanner(System.in);
		
		
		//Example:1
		/*System.out.println("Enter a number:");
		int num= sc.nextInt();
		System.out.println(100/num);   //ArithmeticException
		*/
		
		
		//Example:2

		/*int a[]= new int[5];
		
		System.out.println("Enter the position(0-4):");
		
		int pos=sc.nextInt();
		
		System.out.println("Enter a value:");
		int value=sc.nextInt();
		a[pos]=value;   // user mistake---ArrayIndexOutOfBoundsException

		System.out.println(a[pos]);	*/	
	
	
	// Example:3
	/*	String s="welcome";
		int num=Integer.parseInt(s);   //NumberFormatException
		System.out.println(num);	*/
	
	
	//Example:4
		
	String s=null;    //NullPointerException
	System.out.println(s.length());
	
	
	
	
	
	
	
	
		System.out.println("Program is started...");
		System.out.println("Program is excited...");

		
	
	
	}

}
