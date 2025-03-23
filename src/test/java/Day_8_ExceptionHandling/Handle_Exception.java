package Day_8_ExceptionHandling;

import java.util.Scanner;

public class Handle_Exception {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		try {
			
	
		System.out.println(100/num);  //ArithmeticException
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid data...");
		}
		System.out.println("Program is completed ");
		System.out.println("Program is exited");
		
		
		
	}

}
