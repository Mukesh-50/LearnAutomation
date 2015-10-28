package MyScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDF {
	
	WebDriver driver;
	
	@Test(dataProvider="fbdata")
	public void testDDF(String uname,String pass) throws InterruptedException
	{
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getTitle().equals("Facebook"));
		
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			
			System.out.println("Hurry Your Test "+result.getName() +" Passed");
			driver.quit();
		}
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("Sorry Your Test"+result.getName()+ "Failed");
			driver.quit();
		}
		
	}
	
	
	
	@DataProvider(name="fbdata")
	public Object[][] passData()
	{
		
		Object[][]arr=new Object[2][2];
		
		arr[0][0]="Mukesh1";
		arr[0][1]="Mukesh2";
		arr[1][0]="mukeshotwani.50@gmail.com";
		arr[1][1]="parasoft@903998";
		
		return arr;
	}

}
