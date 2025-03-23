package Day3Arrays;

public class TwoDimensionalArray {
/*
 1. Declare an Array
 2.  add values into Array
 3. Find size of an Array
 4. read single value from an Array
 5. read multiple values of an Array */
	
	public static void main(String[] args) {
	
		// Declaring array
		//Approach 1:
		
		//int [][]a= new int [3][2];
		//int []a[]= new int [3][2];
	/*	int a[][]= new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		// Approach 2:
		int a[][]= {{100,200}, 
				   {300,400},
				    {500,600} 
		};
				
		// find size of an array
		System.out.println("Length of Rows: "+a.length);
		System.out.println("Length of Columns: "+a[0].length);
		
//		read sinlge value from an array
		//System.out.println(a[2][1]);//600
		//normal for
		
		for(int r=0; r<=2;r++) //0 row
		
		{
			for(int c=0; c<=1;c++) //0 column
			{
				System.out.println(a[r][c]); //100f
			}
		}
		
		
		
		
		
		
		
	}

}
