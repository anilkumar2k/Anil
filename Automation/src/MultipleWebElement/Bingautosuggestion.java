package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bingautosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		WebElement searchbar=driver.findElement(By.id("sb_form_q"));
		searchbar.sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> allsuggestion=driver.findElements(By.xpath("//span[contains(text(),'selenium ')]"));
		System.out.println(allsuggestion.size());
		for(int i=0; i<allsuggestion.size();i++)
		{
			Thread.sleep(3000);
			if(allsuggestion.get(i).getText().equalsIgnoreCase("selenium python"))
			{
				allsuggestion.get(i).click();
				break;
			}
			
		}
		
		
		

	}

}
