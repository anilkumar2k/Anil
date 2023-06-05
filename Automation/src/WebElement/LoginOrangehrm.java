package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangehrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		//driver.findElement(By.name("password")).sendKeys("admin123");//
	}

}
