package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspMobileNo_USA {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qspiders.com/contact");
		//System.out.println(driver.findElement(By.xpath("//p[contains(text(),'States')]/../..//span[contains(text(),'+14')]")).getText());
		WebElement phone=driver.findElement(By.xpath("//p[contains(text(),'States')]/../..//span[contains(text(),'+14')]"));
		System.out.println(phone.getText());
	}

}
