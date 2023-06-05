package Pom_classes;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginpage_Assignment_1
{
	public WebDriver driver;
	@FindBy( name="username")
	private WebElement usenameTextField;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeLogin_checkbox;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginButton;
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotten_password;
	public ActitimeLoginpage_Assignment_1(WebDriver driver)
	{
		this.driver= driver;
	 PageFactory.initElements(driver,this);
		
	}
	public void loginMethod() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("actiTIME"));
		usenameTextField.sendKeys("admin");
		password.sendKeys("manager");
		keepmeLogin_checkbox.click();
		loginButton.click();
		
	}
	
	
}

