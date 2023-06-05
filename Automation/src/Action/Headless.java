package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
