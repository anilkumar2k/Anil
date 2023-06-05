package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenYahoo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[autocomplete='given-name']")).sendKeys("Anil kumar");
		driver.findElement(By.cssSelector("input[autocapitalize='off']")).sendKeys("anil@29");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[placeholder='YYYY']")).sendKeys("1981");
		
	}

}
