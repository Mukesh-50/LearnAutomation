package DemoCodes;

import java.io.File;
import library.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class CopyOfHeadlessBrowser {

	public static void main(String[] args) 
	{
		
		System.setProperty("phantomjs.binary.path", new File("C:\\Software\\Phantom\\phantomjs-2.0.0-windows\\bin\\phantomjs.exe").getAbsolutePath());
		WebDriver driver=new PhantomJSDriver();
		driver.get("http://www.facebook.com/");
		System.out.println("Title is "+driver.getTitle());
		Utility.captureScreenshot(driver, "headless");
	}

}
