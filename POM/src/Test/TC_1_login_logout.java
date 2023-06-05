package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitime_pom.HomePage_pom_actitime;
import actitime_pom.Login_page_pom_Actitime;

public class TC_1_login_logout
	{
		public static void main(String[] args) throws InterruptedException 
		{

		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://demo.actitime.com/login.do");
		  driver.manage().window().maximize();
		  Login_page_pom_Actitime loginpage= new Login_page_pom_Actitime(driver);
		  loginpage.loginMethod();
		  HomePage_pom_actitime homepage = new HomePage_pom_actitime(driver);
		  homepage.logoutMethod();
		  driver.quit();
		  
				  
				  
		}
   }
