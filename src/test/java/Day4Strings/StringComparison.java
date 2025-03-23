package Day4Strings;

public class StringComparison {

	public static void main(String[] args) {
// Case:1
		/*
		 * String s1= "welcome"; String s2 = "welcome";
		 * 
		 * System.out.println(s1==s2); System.out.println(s1.equals(s2));
		 */
		// Case:2
		/*
		 * String s1= new String("welcome"); String s2= new String("welcome");
		 * System.out.println(s1); System.out.println(s2);
		 * 
		 * System.out.println(s1==s2); // false // to compare the object
		 * System.out.println(s1.equals(s2));// true // to compare the values of object
		 */

		// Case:3

		/*
		 * String s1="abc"; String s2=new String ("abc"); System.out.println(s1==s2);
		 * System.out.println(s1.equals(s2));
		 */
		// Case:4

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = s2;

		System.out.println(s1 == s2);// false

		System.out.println(s1.equals(s2));// true //because objects are same/equal
		System.out.println(s2 == s3);// true
		System.out.println(s1 == s3);// false
		System.out.println(s1.equals(s3));// true
	}

}
