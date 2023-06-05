package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterQSPIDER_inLowerCase {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		String s="QSPIDER";
	    username.sendKeys(s.toLowerCase());
	    //String value=username.getAttribute("value");
	    //String s=value.toLowerCase();
	    //username.sendKeys(s);
		

	}

}
