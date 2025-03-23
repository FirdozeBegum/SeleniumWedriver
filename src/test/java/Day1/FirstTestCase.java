package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// ChromeDriver driver= new ChromeDriver();

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");

		driver.manage().window().maximize();

		String act_title = driver.getTitle();

		if (act_title.endsWith("Your Store")) {
			System.out.println("Test Passed");
		}

		else {
			System.out.println("Test Failed");
		}
		//Thread.sleep(1000);
		//driver.close();
	}

}
