package Day3Arrays;
/*1.  Declare an Array
 2.  find values into Array
 3. Find length of an Array
 4. Read single value from an Array
 5. Read multiple values of an Array
  */
public class SinlgeDimesionalArray {

	public static void main(String[] args) {
//		 Declaring Array
		// Approach 1:
		/*int a[]= new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
//	Approach 2:
		int a []= {100,200,300,400,500};
		
		
//		 find length of an array
	System.out.println(	"Length of an Array:  "  +a.length);
		
//	How to read single value of an array
	//System.out.println(a[2]); // here 2 is index	
	
	
	// reading all the values of an array
	// Normal For Loop
	/*
	 
	for(int i=0; i<a.length; i++ ) {
		System.out.println(a[i]);
		
	}
	*/
	
	// enhanced For loop/ for..each loop
	
	for(int x:a)
	{
		System.out.println(x);
	}
	
	
	
	
	}

}
