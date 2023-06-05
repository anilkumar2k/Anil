package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Anil kumar");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("3456");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
