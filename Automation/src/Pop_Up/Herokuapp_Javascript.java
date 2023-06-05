package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapp_Javascript {

	public static void main(String[] args) throws InterruptedException 
	
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().sendKeys("Azz");
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            
            
    }
}
	
