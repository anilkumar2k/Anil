package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn_Insta {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[aria-label='Mobile Number or Email']")).sendKeys("9856347");
		driver.findElement(By.cssSelector("input[aria-label='Full Name']")).sendKeys("Anil kumar");
		driver.findElement(By.cssSelector("input[aria-label='Username']")).sendKeys("active");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("78469");
	}
}
