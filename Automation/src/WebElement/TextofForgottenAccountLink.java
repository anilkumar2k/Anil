package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextofForgottenAccountLink {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.linkText("Forgotten account?")).getText());
	}

}
