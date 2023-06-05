package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia_India {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		WebElement searchbar= driver.findElement(By.id("searchInput"));
		searchbar.sendKeys("india");
		Thread.sleep(3000);
		List<WebElement> allsuggestion =driver.findElements(By.xpath("//em[@class='suggestion-highlight']/.."));
		System.out.println(allsuggestion.size());
		for (int i =0;i<allsuggestion.size();i++)
		{
			Thread.sleep(1000);
			if (allsuggestion.get(i).getText().equalsIgnoreCase("indian national congress"))
			{
				allsuggestion.get(i).click();
				break;
			}
		}
		
	}

}
