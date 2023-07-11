package IndigoiOS.IndigoAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseIndigoiOS {
	
	public IOSDriver driver;

	@Test
	public static IOSDriver<IOSElement> setup() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		dc.setCapability(MobileCapabilityType.APP, "/Users/c100-96/Library/Developer/Xcode/DerivedData/com.shireburn.indigo-gjkkxlaruptexoaffdchloigsybb/Build/Products/Debug-iphonesimulator/ShireburnIndigo.app");
		
		//URL url = new URL("http://127.0.0.1.4723/wd/hub");		
		//IOSDriver<IOSElement> driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723"), dc);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		

		//IOSDriver driver = new IOSDriver(url,dc);
		
		return driver;		
	}

}
