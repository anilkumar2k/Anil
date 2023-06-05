package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Instagram {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("anil29");
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("2345869698");
		Thread.sleep(5000);
		WebElement signinButton=driver.findElement(By.xpath("//div[.='Log in']"));
		signinButton.click();
		}

}
