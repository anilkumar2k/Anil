package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_home {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement home= driver.findElement(By.xpath("(//div[.='Home'])[2]"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.moveToElement(home).perform();
	}

}
