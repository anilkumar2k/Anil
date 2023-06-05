package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickForgotPasswordActitime {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.linkText("Forgot your password?")).click();
	}

}
