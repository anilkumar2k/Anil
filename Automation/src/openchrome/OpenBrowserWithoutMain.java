package openchrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserWithoutMain {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
      ChromeDriver driver= new ChromeDriver();
	}

}
