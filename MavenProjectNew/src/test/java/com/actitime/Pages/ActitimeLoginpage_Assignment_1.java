package com.actitime.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.AutoConstant;
import com.actitime.generic.BasePage;
import com.actitime.generic.ExcelLibrary;
import com.actitime.generic.Utility;

public class ActitimeLoginpage_Assignment_1 extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy( name="username")
	private WebElement usernameTextField;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeLogin_checkbox;
	//@FindBy(xpath = "//div[.='Login ']")
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotten_password;

	public ActitimeLoginpage_Assignment_1(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	public void loginMethod() throws IOException, InterruptedException 
	{
		visibilityofElement(driver, usernameTextField);
		Utility.highlightElement(driver, usernameTextField);
		usernameTextField.sendKeys(ExcelLibrary.getCellValue(sheet_name_login, 1, 0));

		visibilityofElement(driver, password);
		Utility.highlightElement(driver, password);

		password.sendKeys(ExcelLibrary.getCellValue(sheet_name_login, 1, 1));

		visibilityofElement(driver, keepmeLogin_checkbox);
		javascriptClick(driver, keepmeLogin_checkbox);

		//visibilityofElementLocator(driver, loginButton, By.xpath("//div[.='Login ']"));
		//visibilityofElement(driver, loginButton);
		visibilityofElement(driver, loginbutton);
		javascriptClick(driver, loginbutton);

	}
	public void titlevalidate()
	{
		titleis(driver, "actiTIME - Enter Time-Track");
		validateTitle(driver, "actiTIME - Enter Time-Track");
	}


}

