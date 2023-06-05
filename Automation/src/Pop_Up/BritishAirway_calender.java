package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BritishAirway_calender {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.britishairways.com/travel/home/public/en_in/");
		driver.findElement(By.id("ensCloseBanner")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='date h1 ng-binding']")).click();
		Thread.sleep(2000);
		WebElement monthyear = driver.findElement(By.xpath("//span[@class='month-name bold ng-binding']"));
		String month_year2= monthyear.getText();
		while(!(month_year2.equals("January 2024")))
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@data-icon=\"\"])[2]")).click();
			WebElement newmonthyear= driver.findElement(By.xpath("//span[@class='month-name bold ng-binding']"));
			month_year2= newmonthyear.getText();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='29']")).click();
		
	
	}

}
