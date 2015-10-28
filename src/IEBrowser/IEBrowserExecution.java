package IEBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IEBrowserExecution {

	public static void main(String[] args)
	
	{
		
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumDriver\\IEDriverServer.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.learn-automation.com");
		
		System.out.println(driver.getTitle());
		

	}

}
