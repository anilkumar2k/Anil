package nisit;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import openchrome.webdriver;

public class MultiWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		List<WebElement> dataList=driver.findElements(By.xpath("//li[@class='sbct']"));
		
		for(int i=0;i<dataList.size();i++)
		{
			if(dataList.get(i).getText().equalsIgnoreCase("selenium webdriver"))
			{
				dataList.get(i).click();
				break;
			}
		}
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("nisit");
		driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//div/img[@class='_8idr img']")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		Actions actions=new Actions(driver);
		actions.getActiveKeyboard()actions.
		l
		
		
	}

}
