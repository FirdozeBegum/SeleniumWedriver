package Selenium_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// get(url)-open the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//System.out.println(driver.getCurrentUrl());
		
		//getTitle()--returns title of the page
	//	System.out.println(driver.getTitle());
		
		// getCurrent Url()--returns title of the page
	//	System.out.println(driver.getCurrentUrl());
		
		//getPageSource()--returns source code of the page
	//	System.out.println(	driver.getPageSource());
		
		//getWindowHandle()--returns single browser window
		//String window=driver.getWindowHandle();
		//System.out.println("Window: "+window);
		
		//getWindowHadles()-returns multiple browser window
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		
		
		
		
		driver.quit();
		
	}
}
