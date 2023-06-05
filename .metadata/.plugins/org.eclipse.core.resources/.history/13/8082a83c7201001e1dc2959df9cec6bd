package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_pom_actitime 
{
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement loutoutLink;
	public HomePage_pom_actitime (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logoutMethod()
	{
		loutoutLink.click();
	}

}
