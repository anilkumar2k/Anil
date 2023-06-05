package Pom_classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime_Tasks 
{
	WebDriver driver;
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement addnewbutton;
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcustomer;

	public  ActiTime_Tasks (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void newcustomerMethod()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='title ellipsis']")));
		addnewbutton.click();
		newcustomer.click();
	}

}
