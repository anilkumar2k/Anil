package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterQspiderIn_Uppercase {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		String s ="qspider";
		username.sendKeys(s.toUpperCase());
	}

}
