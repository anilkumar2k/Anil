package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{ 
	//webdriver interface
	public void validateTitle(WebDriver driver ,String expectedTitle)
	{
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"both title are not matching");
		Reporter.log("both title are matching");
	}
	//select class
	public void selectByText(WebElement element ,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	//Action class
	public void movetoElement(WebDriver driver, WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		
	}
	//Robot class
	public void robotEnter() throws AWTException, InterruptedException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	//webdriver wait class
	public void titleis(WebDriver driver, String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(title));
		
	}
	public void  visibilityofElement(WebDriver driver , WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void visibilityofElementLocator(WebDriver driver , WebElement element , By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	//javascript executor
	public void javascriptClick(WebDriver driver , WebElement element)

	{
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		//js.executeAsyncScript("arguments[0].click()", element);
		js.executeScript("arguments[0].click()", element);
	}
	public void javascriptEnter(WebDriver driver , String value , WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(value, element);
	}	
	//Alert Interface
		public void alertAccept(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
}
