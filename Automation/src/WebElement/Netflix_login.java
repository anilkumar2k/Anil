package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix_login {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[data-uia='login-field']")).sendKeys("anilkumar2k@gmail.com");
		driver.findElement(By.cssSelector("input[data-uia='password-field']")).sendKeys("112332");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();	}

}
