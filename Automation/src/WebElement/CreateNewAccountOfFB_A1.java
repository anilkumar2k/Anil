package WebElement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// using cssSelector locator


public class CreateNewAccountOfFB_A1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[tabindex='0']")).sendKeys("Anil");
		driver.findElement(By.cssSelector("input[aria-label='Surname']")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("anil@29");
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("12345");
		
		
	}

}
