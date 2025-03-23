package Day3Arrays;

import java.util.Arrays;

public class SortingStrings {
	public static void main(String[] args) {

	String c[]= {"Scott","marry","john","David"};
//	char c[]= {'D','C','B','A'};	
	
	System.out.println("before sorting....  "+Arrays.toString(c) );
	
	Arrays.sort(c);
	System.out.println("after sorting....  "+Arrays.toString(c));
	
	
	
	}
}
