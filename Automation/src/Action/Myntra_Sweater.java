package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Sweater {;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement men=driver.findElement(By.xpath("//a[.='Men']"));
		Actions actions= new Actions(driver);
		actions.moveToElement(men).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Sweaters']")).click();
		
	}

}
////a[.='Sweaters']