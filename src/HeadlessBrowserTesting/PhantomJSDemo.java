package HeadlessBrowserTesting;

import java.io.File;

import library.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomJSDemo 
{
	@Test
	public void verifyFacebookTitle()
	{
		
		File src=new File("C:\\Software\\Phantom\\phantomjs-2.0.0-windows\\bin\\phantomjs.exe");
		
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		
		WebDriver driver=new PhantomJSDriver();
		
		driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		Utility.captureScreenshot(driver, "PhantomJSDriverExample");
			
	}

}
