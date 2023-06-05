package Java_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_loginErrorMsg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		WebElement errormsg= driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
		String errorText = errormsg.getText();
		System.out.println(errorText);
		if (errorText.equals("Username or Password is invalid. Please try again."))
		{
			System.out.println("Error text is matching");
		}
		else
		{
			System.out.println("Error text is not matching");
		}
	}
}