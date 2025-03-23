package Day_5_OOPS_Polymorphism;

public class Box {
	double width, height, depth;
	Box ()  // default constructor
	{
		/*width=0;
		height=0;
		depth=0;
		*/
		width=height=depth=0;
	}
	Box(double w, double h,double d)  //2
	{
		width=0;
		height=0;
		depth=0;
	}
	
	Box(double len)  //3
	{
		width=height=depth=len;
	}
	
	double volume()
	{
		return(width*height*depth);
	}
	
	
}
