package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement men1= driver.findElement(By.xpath("//a[.='Men']"));
		Actions action = new Actions(driver);
		action.moveToElement(men1).perform();
		
		
	}

}
