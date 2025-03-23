package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		// name
		// driver.findElement(By.name("_nkw")).sendKeys("Mac");
		// id
		// boolean logoDisplayStatus =
		// driver.findElement(By.id("gh-logo")).isDisplayed();
		// System.out.println(logoDisplayStatus);

		// LinkText--> (a) & partialLinktext

		// driver.findElement(By.linkText("Fashion")).click();
		// driver.findElement(By.partialLinkText("Fash")).click();// by giving half
		// portion of text as Fash

		/*List<WebElement> headerLinks = driver.findElements(By.className("gh-nav-link"));
		System.out.println("Total number of header links:" + headerLinks.size());
*/
		
		/*List<WebElement>link=driver.findElements(By.tagName("a"));
		System.out.println("Total number of link:"+link.size());
		*/
		
		List<WebElement>images=driver.findElements(By.tagName("ing"));
		System.out.println("Total number of images:"+images.size());
	
		
		//findelement--> single webelement
		//findlements--> multiple webelements List<WebElement>
		
		
		
		
		
		
	}

}
