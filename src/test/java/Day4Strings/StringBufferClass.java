package Day4Strings;

public class StringBufferClass {
//*** reverse method present only on string buffer and string builder
	public static void main(String[] args) {

//		Appraoch3: using String buffer class
		/*
		  StringBuffer s= new StringBuffer("welcome");
		  
		  System.out.println("Reverse string is: "+s.reverse());
		 */

//	Approach 4: using Buffer Class

		StringBuilder b = new StringBuilder("Welocme");
		System.out.println("reverse string is: " + b.reverse());

	}

}
