package Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_contextClick {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement link= driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions actions= new Actions(driver);
		actions.contextClick(link).perform();
		Robot robot = new Robot();
		for (int i=0;i<=3;i++)
		{
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_DOWN);
		}	
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
