package Java_script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWebPage
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		
		
    }
}
