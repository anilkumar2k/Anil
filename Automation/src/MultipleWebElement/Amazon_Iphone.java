package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Iphone {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchbar= driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("iphone 14");
		Thread.sleep(3000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//div[contains(text(),'iphone 14')]"));
		for (int i=0;i<suggestion.size();i++)
		{
			Thread.sleep(1000);
			if (suggestion.get(i).getText().equalsIgnoreCase("iphone 14 pro max"))
			{
				suggestion.get(i).click();
				break;
			}
		}				
	}

}
