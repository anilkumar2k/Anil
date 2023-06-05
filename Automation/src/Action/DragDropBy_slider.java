package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropBy_slider {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		WebElement minRange= driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.dragAndDropBy(minRange, 100, 0).perform();	
	}
   }
