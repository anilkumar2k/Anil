package Pop_Up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swisnl_quit_popup {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions actions = new Actions(driver);
		actions.contextClick(button).perform();
		Robot robot = new Robot();
		for (int i=1;i<=6;i++)
		{
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_DOWN);
		}
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
