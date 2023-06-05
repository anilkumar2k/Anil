package TestCase_Class;

import org.testng.annotations.Test;

import Pom_classes.BaseTest;
import Pom_classes.HomePage_pom_actitime;
import Pom_classes.Login_page_pom_Actitime;

public class TestCase_1_loginlogout extends BaseTest
{
	@Test
	public void loginlogout() throws InterruptedException
	{
		Login_page_pom_Actitime loginpage= new Login_page_pom_Actitime(driver);
		loginpage.loginMethod(); 
		HomePage_pom_actitime homepage = new HomePage_pom_actitime(driver);
		homepage.logoutMethod();

	}
}
