package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_MustardOil {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("mustard oil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'/search?q=mustard+oil+15+litre')]")).click();
	}

}
