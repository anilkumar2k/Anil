package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspiders_Remove {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("qspiders");
		String value = username.getAttribute("value");
		Thread.sleep(3000);
		for (int i=value.length()-1;i>=0;i--)
		{
			char c =value.charAt(i);
					if (c== 'p' ||c== 'e')
					{
						username.sendKeys(Keys.BACK_SPACE);
					}
					else
					{
						username.sendKeys(Keys.ARROW_LEFT);
					}
		}
		
		
	}

}
