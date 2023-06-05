package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFromHtmlToUsername {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.xpath("/html//div//div//div//div//div//div//div//div//div//div[1]//div[1]//input[1]")).sendKeys("Anil");

	}

}
