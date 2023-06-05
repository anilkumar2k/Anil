package openchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enterurl 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.myntra.com");
	} 

}
