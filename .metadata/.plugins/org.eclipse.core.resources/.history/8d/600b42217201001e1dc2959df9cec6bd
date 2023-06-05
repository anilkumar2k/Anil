package generic;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot1 implements ITestListener 
{
 public void  onTestSuccess(ITestResult result) 
 {
	 TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
	 File srcfile= ts.getScreenshotAs(OutputType.FILE);
	 String methodName = result.getName();
	 Date date = Calendar.getInstance().getTime();
	 String today =date.toString().replaceAll(":","_");
	 File destfile =new File("./FailedScreenshot/"+ methodName + today+".png");
	try {
		org.openqa.selenium.io.FileHandler.copy(srcfile, destfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 } 

}
