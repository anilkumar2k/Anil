package generic;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot implements ITestListener
{
	public void onTestFailure(ITestResult result) 
	{
		TakesScreenshot ts =(TakesScreenshot)BaseTest.driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./FailedScreenshot/failed.png");
		try 
		{
			FileHandler.copy(srcfile, destfile);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
