package Anjali.com.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterqspidersInUPPERCASE {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("qspiders");
		String value=username.getAttribute("value");
		username.sendKeys(Keys.CONTROL,"a");
		username.sendKeys(Keys.BACK_SPACE);
		String Uppervalue=value.toUpperCase();
		username.sendKeys(Uppervalue);
	}

}
