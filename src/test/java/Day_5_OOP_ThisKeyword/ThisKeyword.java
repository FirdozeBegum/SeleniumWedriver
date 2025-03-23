package Day_5_OOP_ThisKeyword;

// outside of the class is called global variables
public class ThisKeyword {

	int x, y; // class variables / instance variables

	/*
	 ThisKeyword(int a, int b) { 
	  this.x = x; this.y= y;
	  
	  }
	 */
	void setData(int a, int b) {
		x = a;
		y = b;
	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) { // inside main method is called local variables
		// ThisKeyword th = new ThisKeyword(100, 200);
		ThisKeyword th = new ThisKeyword();
		th.setData(100, 300);
		th.display();
	}

	
	
	
	
	
	
	
	
	
}
