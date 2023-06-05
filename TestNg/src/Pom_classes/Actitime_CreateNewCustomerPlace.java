package Pom_classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime_CreateNewCustomerPlace
{
	public WebDriver driver;
	@FindBy(xpath="(//input[contains(@class,'inputFieldWithPlaceholder')])[4]")
	private WebElement customername_textfield;
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement create_costomer;
	
	public Actitime_CreateNewCustomerPlace (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void newCustomerMethod() throws InterruptedException
	{
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'inputFieldWithPlaceholder')])[4]")));
		customername_textfield.sendKeys("anil");
		create_costomer.click();
		Thread.sleep(10000);
	}
}
