package Day4Strings;

public class String_Vs_StringBuffer_Vs_StringBuilder {

	public static void main(String[] args) {
		// String- immutable
	/*	String s= "Welcome";
		s.concat("to java");
		System.out.println(s); // immutable cannot cahnge original value of s
		*/
		
		//String Buffer- mutable
		/*StringBuffer b= new StringBuffer("welcome");
		b.append("to java");
		System.out.println(b); 
		we can change original value of b*/
		
		//String builder -- mutable
		StringBuilder s= new 	StringBuilder("welcome");
		s.append("to java");
		System.out.println(s);
		
		
		
		
		
		

	}

}
