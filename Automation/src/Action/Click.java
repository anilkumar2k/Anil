package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement link =driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions actions = new Actions(driver);
		actions.click(link).perform();

	}

}
