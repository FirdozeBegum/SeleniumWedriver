package Day_8_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_Exceptions {
//throws
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Programstarted...");
		System.out.println("program in progress");

		Thread.sleep(5000);

		FileInputStream fis = new FileInputStream("C:\\TEXT.TXT");

		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) {
		 * 
		 * e.printStackTrace(); }
		 */

		System.out.println("program finished");
		System.out.println("program exited");

	}

}
