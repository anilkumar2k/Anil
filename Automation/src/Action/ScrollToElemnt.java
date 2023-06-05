package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElemnt {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		WebElement link = driver.findElement(By.xpath("//span[.='Free quote compendium']"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(link).click(link).perform();
	}

}
