package Day_8_ExceptionHandling;
/*
 * case:1 Exception occured,catch block handled-->finally block will execute
 * case:2 Exception occured,catch block Not handled-->finally block will execute
 * case:3 Exception does not occured, catch block ignored -->finally block will execute
 * */// unchecked exceptions
public class Finally_Block {

	public static void main(String[] args) {
		//String s= null;
		String s="welcome";
		try {
			System.out.println(s.length());
		}
		
		
		catch(NullPointerException e) {
			System.out.println("catch block handle exception");
			System.out.println(e.getMessage());

		}
		finally
		{
			System.out.println("you entered into finally block");
		}
		
		System.out.println("Program finished....");
		
		
	}

}
