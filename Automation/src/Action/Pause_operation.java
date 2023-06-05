package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pause_operation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Actions actions = new Actions(driver);
		actions.pause(4000);
		actions.sendKeys("Anil").perform();
		actions.pause(Duration.ofSeconds(3));
		actions.sendKeys(Keys.TAB).sendKeys("sahoo").perform();
		actions.pause(3000);
		actions.sendKeys(Keys.TAB).sendKeys("9567839038").perform();
		actions.pause(3000);
		actions.sendKeys(Keys.TAB).sendKeys("Anil@29").perform();
	}

}
