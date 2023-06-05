package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHold_Release {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
        WebElement link = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(link).perform();
        Thread.sleep(5000);
        actions.release(link).perform();	}

}
