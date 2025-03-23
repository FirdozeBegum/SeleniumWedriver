package Day4Strings;

import java.util.Arrays;

public class Mutable_Vs_Immutable {

	public static void main(String[] args) {
	
	// mutable means-> we can change
		
		/*int a[]= {20,10,40,50,30};		
	
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); // mutable
		System.out.println(Arrays.toString(a));*/
		
		
//		immutable means-> we cannot change
		String s= new String("Welcome");
		System.out.println(s); // welcome
		String concatstring=s.concat("to java");
		System.out.println(concatstring);  // welcome
		
		
		
		
		
		
		
		
		
		
		

	}

}
