package MultipleWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_DOB {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement create =driver.findElement(By.xpath("//a[text()='Create new account']"));
		create.click();
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select=new Select(date);
		select.selectByVisibleText("20");
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select select2=new Select(month);
		select2.selectByVisibleText("Feb");
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select3= new Select(year);
		select3.selectByVisibleText("2000");
		
	}

}
