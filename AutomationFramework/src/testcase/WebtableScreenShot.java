package testcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
@Test
public class WebtableScreenShot
{
  public void screenshotWebTable() throws IOException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://omayo.blogspot.com/");
	 WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
	 File srcfile = table.getScreenshotAs(OutputType.FILE);
	 File destfile= new File("./FailedScreenshot/webtable.png");
	
	FileHandler.copy(srcfile, destfile);
	
  }
   }
 