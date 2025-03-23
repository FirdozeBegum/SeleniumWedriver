package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Locators {
//firdoze
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize(); // manage method

		// tag id tag#id
		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");

		// tag class tag.class

		// driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("shirts");
		// driver.findElement(By.cssSelector(".search-box-text")).sendKeys("shirts");

		// tag attribute

//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("t-shirts");
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Tshirts");
	}

}
