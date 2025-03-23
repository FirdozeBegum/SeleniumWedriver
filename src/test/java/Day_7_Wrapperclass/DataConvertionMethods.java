package Day_7_Wrapperclass;

public class DataConvertionMethods {

	public static void main(String[] args) {
		// String --> Integer
		// String s= "Welcome"; // cannot convert to int

		/*
		 * String s1="10"; String s2="30";
		 * System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		 * 
		 */

		// String to double
		/*
		 * String s1="10.5"; String s2="20.5";
		 * 
		 * System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		 */

		// String--> boolean
		// String s="Selenium";// other than true if you pass any string that will
		// return false

		// System.out.println(Boolean.parseBoolean(s));

		//String--> char NOT POSSIBLE
		
		
		// int, double, boolean, char---> String
		int a = 20;
		double d = 10.5;
		char c = 'A';
		boolean bool = true;

		String s = String.valueOf(a);
		System.out.println(s);

		s = String.valueOf(d);
		System.out.println(s);

		s = String.valueOf(c);
		System.out.println(s);

		s = String.valueOf(bool);
		System.out.println(s);

	
	
	
	
	
	
	
	
	
	
	}

}
