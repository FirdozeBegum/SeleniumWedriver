package Day9_TypeCating;



class Parent
{
	String name="John";
	 void m1() 
	 {
		 System.out.println("this is m1 from parent...");
	 }
	 
	 
	 class Child extends Parent
	 {
		 int id=101;
		 void m2()
		 {
			 System.out.println("this is m2 from child...");
		 }
		 
	 }
}
public class TypeCasting_Objects1 {
	public static void main(String[] args) {

	//Approach:1
/*	Child c=new Child();
	System.out.println(c.name);
	c.m1();//parent
	System.out.println(c.id);//child
	c.m2();//child
	*/
	
	
/*	Parent p  = new Child(); //UpCasting
	System.out.println(p.name);
	p.m1();
	System.out.println(p.name);
*/
	
	
	
	
	
	
	
	}
}
