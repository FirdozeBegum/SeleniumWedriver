package Day_8_ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("Program is started..");
		
		String s= null;
		
		
		try {
			System.out.println(s.length());
		}
		/*catch(ArithmeticException e) {
			System.out.println("handled exception...");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Handled exception...");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("handled exception...");
			System.out.println(e.getMessage());
		}*/
		
		catch(Exception e) {
			System.out.println("Handle exception.....");
			System.out.println(e.getMessage());
			
		}
		
		
		System.out.println("Program finished.....");
		
	}

}
