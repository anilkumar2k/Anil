package Pom_classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest
{
	public WebDriver driver;
	@BeforeSuite
	public void executionstart()
	{
		Reporter.log("execution start", true);
	}
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	   driver.get("https://demo.actitime.com/login.do");
	}
	@AfterClass
	public void close_browser()
	{
		driver.quit();
	}
	@AfterSuite
	public void end()
	{
		Reporter.log("execution end", true);
	}

}
