package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNumericValueOf_Table_omayo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		List<WebElement> numericValue =driver.findElements(By.xpath("//table[@id='table1']//tr/td[2]"));
		System.out.println(numericValue.size());

	}

}
