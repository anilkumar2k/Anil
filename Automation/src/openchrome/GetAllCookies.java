package openchrome;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllCookies {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
	    Set<Cookie> cookies =driver.manage().getCookies();
	    for (Cookie cookie : cookies)
	    {
			System.out.println("cookies name is :"+ cookie.getName());
			System.out.println("cookies value is :"+ cookie.getValue());
			System.out.println("cookies domain is :"+ cookie.getDomain());
			System.out.println("cookies path is :"+ cookie.getPath());
			System.out.println("cookies expiry is :"+ cookie.getExpiry());
			System.out.println("..........................");
		}
	  
		
	}

}
