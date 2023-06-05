package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_pom_Actitime
{

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
	public Login_page_pom_Actitime(WebDriver driver)
	{
	 PageFactory.initElements(driver,this);
		
	}
	public void loginMethod() throws InterruptedException 
	{
		usenameTextField.sendKeys("admin");
		password.sendKeys("manager");
		 keepmeLogin_checkbox.click();
		 loginButton.click();
		 Thread.sleep(2000);
		
	}
	
	
}
