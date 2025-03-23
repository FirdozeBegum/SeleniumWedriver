package Selenium_Methods;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Conditional_Methods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		// isdisplay()--this logo is displayed or not

		// Check if the logo is displayed using isDisplayed()
		boolean isLogoDisplayed = driver.findElement(By.className("header-logo")).isDisplayed();

		// Print the result
		System.out.println("Is the logo displayed? " + isLogoDisplayed);

//        driver.findElement(By.linkText("Register")).click();
		// Step 1: Click on the "Register" link (Anchor tag)
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		registerLink.click();

		// Step 2: Fill in the registration form

		// First Name field
		/*
		 * WebElement firstNameField = driver.findElement(By.id("FirstName"));
		 * firstNameField.sendKeys("John"); boolean
		 * status=driver.findElement(By.id("FirstName")).isEnabled();
		 * System.out.println("Enable status: " + status);
		 */

		// isSelected()
		
		WebElement male_rd = driver.findElement(By.id("gender-male"));
		WebElement female_rd = driver.findElement(By.id("gender-female"));

		System.out.println("Before selection......");
		male_rd.click();
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());

		// Close the browser
		driver.quit();

	}
}
