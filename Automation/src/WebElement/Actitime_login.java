package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_login {

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
		
		
	}

}
