package Java_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeCreateWork_VerifyError_Msg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("(//input[@placeholder='Username'])")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Login '])")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@onclick=\"PopupMenu.show(event, $('#popup_menu_settings'));\"])[1]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a [contains(text(),'Types of Work')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("name")).sendKeys("Anil");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(4000);
	    driver.navigate().refresh();
	   // driver.findElement(By.name("name")).sendKeys("Anil");
	   driver.findElement(By.xpath("//input[@type='submit']")).click();

	    WebElement errormsg= driver.findElement(By.id("ClientSideErrorMessage"));
	    
	    String errorText =errormsg.getText();
	    System.out.println(errorText);
	    if (errorText.contains("There are errors in the fields highlighted in red."))
	    {
	    	System.out.println("error msg is matcing");
	    }
	    else
	    {
	    	System.out.println("error msg is not matcing");
	    }
	    	
	    
	    //driver.findElement(By.xpath("//a[.='Anil']/../..//a[contains(text(),'delete')]")).click();
		}

}

