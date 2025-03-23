package Day_5_OOPS_Polymorphism;

public class AdderMain {

	public static void main(String[] args) {

		Adder ad = new Adder();
		ad.sum(); //1
		ad.sum(200, 600);//2
		ad.sum(30, 40.9);//3
		ad.sum(10.4, 20);//4
		
		ad.sum(10, 20, 20);//5
		

	}

}
