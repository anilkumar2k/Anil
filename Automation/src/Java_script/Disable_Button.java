package Java_script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable_Button {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement button= driver.findElement(By.id("but1"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		if(button.isEnabled())
		{
			System.out.println("element is enable");
		}
		else 
		{
			System.out.println("it is disable");
			js.executeScript("arguments[0].click()", button);
			System.out.println("button was clicked");
			
		}
		//js.executeAsyncScript("arguments[0].click()",button);
		
	}

}
