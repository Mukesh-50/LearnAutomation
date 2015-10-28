package DemoCodes;

import library.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HeadlessBrowser {

	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		report=new ExtentReports("C:\\Report\\report1.html",true);
		
	}
	
	
	@Test
	public  void verfiyTitle()
	{
		logger=report.startTest("my test");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "App up and running");
		driver.get("http://www.facebook.com/");
		System.out.println("Title is "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.log(LogStatus.FAIL, "Verificaton failed");
			String path=Utility.captureScreenshot(driver,result.getName());
			System.out.println();
			logger.log(LogStatus.FAIL,"test",logger.addScreenCapture(path));
		}
		
		report.endTest(logger);
		report.flush();
		driver.get("C:\\Report\\report1.html");
		
	}

}
