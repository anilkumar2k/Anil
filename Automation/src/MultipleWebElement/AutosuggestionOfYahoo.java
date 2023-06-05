package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionOfYahoo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/?guccounter=1");
        WebElement searchbar=driver.findElement(By.id("ybar-sbq"));
        searchbar.sendKeys("selenium");
        Thread.sleep(3000);
       // List<WebElement> suggest =driver.findElements(By.xpath("//b[contains(text(),'selenium')]"));
        for(int i=0;i<=5;i++)
        {
        	Thread.sleep(1000);
        	searchbar.sendKeys(Keys.ARROW_DOWN);
        }
        searchbar.sendKeys(Keys.ENTER);
	}

}
