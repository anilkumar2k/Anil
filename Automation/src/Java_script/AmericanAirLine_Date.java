package Java_script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmericanAirLine_Date {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		WebElement date =driver.findElement(By.id("aa-leavingOn"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='01/12/2024'", date);
		
	}

}
