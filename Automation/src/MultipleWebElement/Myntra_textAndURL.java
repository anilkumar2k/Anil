package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_textAndURL {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		System.out.println(allLinks.size());
		for (int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
		for (int i=0;i<allLinks.size();i++)
		{
			Thread.sleep(2000);

			System.out.println(allLinks.get(i).getAttribute("href"));
		}
	}

}
