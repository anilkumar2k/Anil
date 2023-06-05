package openchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateOperation {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.myntra.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();		
		

	}

}
