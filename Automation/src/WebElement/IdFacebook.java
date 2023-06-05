package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("anil");
		driver.findElement(By.name("pass")).sendKeys("12345");

	}

}
