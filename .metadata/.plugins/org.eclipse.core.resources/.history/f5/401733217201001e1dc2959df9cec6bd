
package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest1 implements AutoConstant
{
	public static  WebDriver driver;
	//@Parameters("browser")
	//@BeforeSuite
	//public void executionStart()
	//{
	 // Reporter.log("executionstart", true);
	//}
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	{	
		if (browser.equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get(url);
	}
		else if (browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			driver.get(url);
		}
	}
	//@AfterClass
//	public void teardown()
	//{
		//driver.quit();
		
	//}
	//@AfterSuite
//	public void executionComplete()
	//{
		//Reporter.log("execution complete", true);
	//}

	}


