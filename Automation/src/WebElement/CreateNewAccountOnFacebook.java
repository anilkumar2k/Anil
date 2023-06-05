package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccountOnFacebook {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("anil");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("anil@29");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");	
		
	}

}
