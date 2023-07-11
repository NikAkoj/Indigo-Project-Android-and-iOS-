package Mavenproj.IndigoAutomation;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseIndigo 
{
	static AndroidDriver<AndroidElement> driver;
	
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
	
		
		File appDirectory = new File("src");
		
		File app = new File(appDirectory, "Indigo_1.0.53_11-05-2023-debug (1).apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//To run a script in emulator
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nayanemulator");
		
		/* To run a script in real device 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");   */
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), cap);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;				

	}
	
	
	
	public static String captureScreenshot(String filename) throws IOException
	
	   {
		
	AndroidDriver<AndroidElement> driver = capabilities();

	TakesScreenshot scrshot = (TakesScreenshot)driver;

	File source = scrshot.getScreenshotAs(OutputType.FILE);

	String path = System.getProperty("user.dir") +"\\screenshots\\"+filename+".png";

	File destination = new File(path);

	FileHandler.copy(source, destination);
	
	return System.getProperty("user.dir") +"\\screenshots\\"+filename+".png";

	   }

	
}
