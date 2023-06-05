package openchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTittle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String actulTitle= driver.getTitle();
		if (actulTitle.contains("googl"))
		{
			System.out.println("navigate to google");
		}
		else
		{
			System.out.println("not navigate to google");
		}


	}

}
