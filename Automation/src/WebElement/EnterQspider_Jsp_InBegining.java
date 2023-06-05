package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterQspider_Jsp_InBegining {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement username =driver.findElement(By.id("email"));
		username.sendKeys("qspider");
		username.sendKeys(Keys.CONTROL,"a");
		username.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		username.sendKeys("jspider");
	}

}
