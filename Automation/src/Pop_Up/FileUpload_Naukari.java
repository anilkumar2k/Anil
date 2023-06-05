package Pop_Up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Naukari {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[.='Register']")).click();
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		StringSelection file = new StringSelection("\"C:\\Users\\hp\\Desktop\\anilupload.docx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
