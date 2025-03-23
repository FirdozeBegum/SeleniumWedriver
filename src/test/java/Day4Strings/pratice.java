package Day4Strings;

import java.util.Scanner;

public class pratice {

	public static void main(String[] args) {
		
	Scanner scanner= new Scanner(System.in);
	// take the input string from the user
	System.out.println("Enter a String:");
		
	String inputString= scanner.nextLine();
	//take the character to counr from the user
	char charaterToCount=scanner.next().charAt(0);
		
	//Initialize a counter to zero
	int count=0;
	//Loop through each character in the string and count occurrence
	
	for(int i=0;i<inputString.length();i++)
	{
		if(inputString.charAt(i)==charaterToCount) {
			count++;
		}
	}
	// Display the result
	System.out.println("The Character  '"+charaterToCount+"' appears  "+ count + "  times.");
		
		//close the scanner
	scanner.close();
		
		
		
		
	
		
		
		
	}

}
