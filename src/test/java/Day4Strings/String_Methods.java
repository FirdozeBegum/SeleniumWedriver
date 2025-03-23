package Day4Strings;

import java.util.Arrays;

public class String_Methods {
	public static void main(String[] args) {

		// String s="Welcome";
		// String s= new String("Welcome");
		// System.out.println(s);

		// length() -- length method returns length of a string (number of characters)
		String s = "welcome";
		s.length();
		// System.out.println(s.length()); //7
		// System.out.println("Welcome".length()); //7

		// concat() -concat method joining strings
		String s1 = "Welcome ";
		String s2 = " to java ";
		String s3 = "automation";
		// System.out.println(s1.concat(s2));
		// System.out.println(s1+s2+s3);

		System.out.println(s1.concat(s2).concat(s3));// welcome to java
		System.out.println(s1.concat(s2 + s3));

		System.out.println("Welcome " + "to java ".concat(s3));

		// trim() - trim method remove space right and left side

		s = "		welcome 	";
		s.length();
		System.out.println("before trimming " + s.length());
		System.out.println(s);

		System.out.println(s.trim());
		System.out.println("after trimming " + s.trim().length());

		// charAt() -charAt method returns a character from a string based on index
		// index starts from 0
		s = "welcome";
		System.out.println(s.charAt(1));

		// contains() -- contains method returns true or false
		System.out.println(s.contains("wel"));// true
		System.out.println(s.contains("come"));// true
		System.out.println(s.contains("Wel"));// false
		System.out.println(s.contains("COME"));// false
		System.out.println(s.contains("welme"));// false

		// equals() , equalsIgnoreCase() - both are used to compared Strings
		s1 = "welcome";
		s2 = "welcome";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals("Welcome"));// false (case sensitive)

		// replace()-- replace single/multiple/sequence of characters in a string
		s = "welcome to selenium java selenium python selenium c#";

		System.out.println(s.replace('e', 'k'));// wklocmk to sklknium java sklknium python sklknium c#

		System.out.println(s.replaceAll("selenium", "playwright"));

		// SubString()-- some portion of main string
		s = "welcome";
		System.out.println(s.substring(0, 5));// welco

		// toUppercase() to lowerCase()
		s = "Welcome";
		System.out.println(s.toLowerCase());// welcome
		System.out.println(s.toUpperCase());// WELCOME

		// split()--split the string into multiple parts based on delimeter
		s = "abc@gmail.com";
		String a[] = s.split("@");
		System.out.println(a[0]);// abc
		System.out.println(a[1]);// gmail.com
		System.out.println(Arrays.toString(a));// [abc, gmail.com]

		// Ex:1

		String amount = "$15,20,55"; // exp 152055
		System.out.println(amount.replace("$", ""));// 15,20,55
		System.out.println(amount.replace("$", "").replace(",", ""));

		// Ex:2
		s = "abc,123@XYZ";
		String arr1[] = s.split(",");
		System.out.println(Arrays.toString(arr1));// [abc, 123@XYZ]

		String arr2[] = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));// [123, XYZ]

		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);

		// Ex:3
		s = "abc 123";
		String ar[] = s.split(" ");
		System.out.println(Arrays.toString(ar));

		//	 * % ^ & ( ) -- you cannot use as delimeters

		//Ex:4
		String name= "John Kenedy";
	
	//System.out.println(name.contains("john")); //false
	
	System.out.println(	name.replace('J', 'j').contains("john"));
	System.out.println(name.toLowerCase().contains("john"));
	
	
	
	}

}
