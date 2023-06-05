package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class America_AirLine {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
     WebElement from= driver.findElement(By.name("origin"));
     Thread.sleep(2000);
     from.sendKeys("san");
     Thread.sleep(2000);
     List<WebElement> allSuggestion=driver.findElements(By.xpath("//a[contains(text(),'San')]"));
    // Thread.sleep(2000);
     for (int i=0;i<allSuggestion.size();i++)
     {
    	 if(allSuggestion.get(i).getText().equalsIgnoreCase("San Antonio (SAT), Texas, USA"))
    	 {
    		 allSuggestion.get(i).click();
    		 break;	 
    	 }
     }
     Thread.sleep(2000);
    	 WebElement to=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
    	 to.sendKeys("las");
    	 Thread.sleep(2000);
    	 List<WebElement> allSuggestion2= driver.findElements(By.xpath("//a[contains(text(),'Las')]"));
         for (int i=0;i<allSuggestion2.size();i++)
         {
        	 if(allSuggestion2.get(i).getText().equalsIgnoreCase("Las Palmas (LPA), Gran Canaria, Spain"))
        	 {
        		 allSuggestion2.get(i).click();
        		 break;	 
        	 }
        }
         Thread.sleep(2000);
         WebElement adult=driver.findElement(By.name("adults"));
         Select select1=new Select(adult);
         select1.selectByVisibleText("4");
         Thread.sleep(2000);
         WebElement children=driver.findElement(By.name("children"));
         Select select2=new Select(children);
         select2.selectByVisibleText("2");
	}
}
