package openchrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

	}
}