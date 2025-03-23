package Day9_TypeCating;

//upcasting -smaller value to higher value
//Eg:1 int-->long
//Eg:2 float->Double
//Downcasting-converting value from larger to smaller
//Eg:1 long--int
//Eg::2 double--float


public class TypeCastingConcept {

	public static void main(String[] args) {
		
		//UpCasting--automatic--- smaller to larger
	/*	Eg:1
	  	int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		*/
		
	/*	Eg:2
	 	float floatvalue=10.5f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		*/
		
	//Downcasting--- manually-- larger to smaller
	//	long longvalue=100000;
	//	int intvalue=(int) longvalue;
		
		/*double doublevalue=125.55;
		float floatvalue=(float)doublevalue;
		System.out.println(floatvalue);*/
		
		//Example:1
		/*int i=100;
		double d=i;    //UpCasting
		System.out.println(d);
		*/
		
		
		//Example:2
	/*	double d=10.5;
		int i=(int)d;
		System.out.println(i);   //DownCasting
		
		*/
		
		
		
	}

}
