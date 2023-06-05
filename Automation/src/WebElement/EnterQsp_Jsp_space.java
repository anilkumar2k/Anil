package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterQsp_Jsp_space {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement username =driver.findElement(By.id("email"));
		username.sendKeys("qspider");
		Thread.sleep(2000);
		username.sendKeys(Keys.SPACE);
		Thread.sleep(2000);

		username.sendKeys("jspider");
	}

}
