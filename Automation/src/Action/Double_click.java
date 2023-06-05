package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement button= driver.findElement(By.xpath("//button[.=' Double click Here   ']"));
		Thread.sleep(2000);
		Actions actions= new Actions(driver);
		actions.doubleClick(button).perform();
	
	}

}
