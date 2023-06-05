package Pom_classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeHomepage_Assignment_1
{
	WebDriver driver;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement loutoutLink;
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement Tasks;
	public ActitimeHomepage_Assignment_1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logoutMethod()
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Me']")));
		
		 Tasks.click();
		loutoutLink.click();
	}

}
