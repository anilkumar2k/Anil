package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.xpath("(//div[.='Washington'])[2]"));
		WebElement target= driver.findElement(By.xpath("//div[.='United States']"));
		Thread.sleep(2000);
		Actions actions = new Actions (driver);
		actions.dragAndDrop(source, target).perform();
	}

}
