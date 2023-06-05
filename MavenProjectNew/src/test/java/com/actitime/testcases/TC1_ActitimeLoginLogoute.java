package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.Pages.ActitimeLoginpage_Assignment_1;
import com.actitime.Pages.HomePage_pom_actitime;
import com.actitime.generic.BaseTest;

public class TC1_ActitimeLoginLogoute extends BaseTest

{
	@Test
	public void loginLogout() throws IOException, InterruptedException
	{
		ActitimeLoginpage_Assignment_1 login = new ActitimeLoginpage_Assignment_1(driver);
		login.loginMethod();
		login.titlevalidate();
		
		HomePage_pom_actitime homepage = new HomePage_pom_actitime(driver);
		homepage.logoutMethod();
		
	}
	
}
