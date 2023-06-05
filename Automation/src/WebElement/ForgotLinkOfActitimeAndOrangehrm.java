package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotLinkOfActitimeAndOrangehrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
}