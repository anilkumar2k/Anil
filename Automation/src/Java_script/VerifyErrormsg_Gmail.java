package Java_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrormsg_Gmail {

	public static void main(String[] args) 
	{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.gmail.com");
			driver.findElement(By.xpath("//span[.='Next']")).click();
			WebElement errormsg = driver.findElement(By.xpath("//div[@class='o6cuMc Jj6Lae']"));
			String errorText = errormsg.getText();
			if (errorText.equals("Enter an email or phone number"))
			{
				System.out.println("error msg is comming and match");
			}
			else 
			{
				System.out.println("error msg not matching");
			}		

	}
	}
