package Pop_Up;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra_Levis {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
        driver.get("https://www.myntra.com/");
        WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
        searchbar.sendKeys("levis");
        Thread.sleep(3000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//li[contains(text(),'Levis')]"));
         for (int i=0;i< suggestions.size();i++)
         {
        	 Thread.sleep(1000);
        	 if (suggestions.get(i).getText().equalsIgnoreCase("Levis Sneakers"))
        	 {
        		 suggestions.get(i).click();
        	 }
         } 
         
         Thread.sleep(3000);
         driver.findElement(By.xpath("//span[.='Color']/..//span[@data-colorhex='black']")).click();
         
	}

}
