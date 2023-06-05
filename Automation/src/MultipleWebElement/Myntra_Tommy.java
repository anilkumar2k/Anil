package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Tommy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
		searchbar.sendKeys("tommy");
		Thread.sleep(3000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//li[contains(text(),'Tommy')]"));
		for (int i=0;i<suggestion.size();i++)
		{
			Thread.sleep(1000);
			if(suggestion.get(i).getText().equalsIgnoreCase("Tommy Hilfiger Watches"))
			{
				suggestion.get(i).click();
				break;
			}		
		}
		/*for (int i=0;i<=3;i++)
		{
			Thread.sleep(1000);
			searchbar.sendKeys(Keys.ARROW_DOWN);
		}
		searchbar.sendKeys(Keys.ENTER); */
	}
}
