package TestCase_Class;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom_classes.ActiTime_Tasks;
import Pom_classes.Actitime_CreateNewCustomerPlace;
import Pom_classes.Homepage2;
import Pom_classes.Login_page_pom_Actitime;

public class ActitimeLogin_Logout 
{
	public WebDriver driver;
	
	@Test
	public void loginLogout() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Login_page_pom_Actitime loginpage= new Login_page_pom_Actitime(driver);
		loginpage.loginMethod(); 
		Homepage2 hometaskbutton = new Homepage2 (driver);
		hometaskbutton.homepage_task_buttonMethod();
	}
	@Test(priority = 1,invocationCount = 2)
	public void create_Customer() throws InterruptedException
	{
		//driver= new ChromeDriver() ;
		ActiTime_Tasks task = new ActiTime_Tasks(driver);
		task.newcustomerMethod();
		Actitime_CreateNewCustomerPlace newcustomer = new Actitime_CreateNewCustomerPlace(driver);
		newcustomer.newCustomerMethod();
	}

		//HomePage_pom_actitime homepage = new HomePage_pom_actitime(driver);
		//homepage.logoutMethod();

	}