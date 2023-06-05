package Pom_classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage2 
{
	public WebDriver driver;
	
    @FindBy(id="container_tasks")
    private WebElement tasklink;
    
    public Homepage2 (WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    public void homepage_task_buttonMethod()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container_tasks")));
    	tasklink.click();
    }
}
