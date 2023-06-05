package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextofCreatePagelinkOfFB {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		System.out.println(driver.findElement(By.linkText("Create a Page")).getText());
	}

}
