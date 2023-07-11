package IndigoiOS.IndigoAutomation;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class AddManualClockingiOS extends BaseIndigoiOS{
	
	
	@Test(priority=1)
	public void Addmanualclocking() throws InterruptedException, MalformedURLException
	{
		IOSDriver<IOSElement> driver = setup();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Log into your Indigo account\"]"));
		login.click();
		
		WebElement uname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		uname.sendKeys("pdg@narola.email");
		
		WebElement btncont = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncont.click();
		
		WebElement password = driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Password\"]"));
		password.sendKeys("Check@123");
		
		WebElement btnsubmit = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btnsubmit.click();
		
		Thread.sleep(10000);
		WebElement btnagree = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Agree\"]"));
		btnagree.click();
		
		WebElement firstcode = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Indigo\"]"));
		firstcode.sendKeys("1");
		
		WebElement secondcode = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Indigo\"]"));
		secondcode.sendKeys("2");
		
		WebElement thirdcode = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Indigo\"]"));
		thirdcode.sendKeys("3");
		
		WebElement fourthcode = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Indigo\"]"));
		fourthcode.sendKeys("4");
		
		WebElement setcode = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Set Access Code\"]"));
		setcode.click();
		
		WebElement laterallow = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Maybe later\"]"));
		laterallow.click();
		
		Thread.sleep(3000);
		WebElement allowaccess = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Allow Access\"]"));
		allowaccess.click();
		
		WebElement allowlocation = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow While Using App\"]"));
		allowlocation.click();
		
		WebElement myschedule = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"My Schedule\"]"));
		myschedule.click();
		
		WebElement selectdate = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Today-Fri 23 Jun\"]"));
		selectdate.click();
		
		WebElement clockingtab = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Clocking\"]"));
		clockingtab.click();
		
		WebElement addmanualclock = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\" Add Manual Clocking\"]"));
		addmanualclock.click();
		
		WebElement clockin = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Please Select Clock-in Time.\"]"));
		clockin.click();
		
		List<IOSElement> values = driver.findElementsByXPath("//XCUIElementTypePickerWheel");
		
				
		//values.get(0).sendKeys("11");
		values.get(1).sendKeys("05");
		values.get(2).sendKeys("AM");
		
		WebElement submittime = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		submittime.click();
		
		//WebElement clockout = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Out: 09:00 pm\"]"));
		//clockout.click();
		
		WebElement clockout = driver.findElementById("Out: 12:05 am");
		clockout.click();
		
		List<IOSElement> values2 = driver.findElementsByXPath("//XCUIElementTypePickerWheel");
		
		String val4=values2.get(0).getAttribute("value");
		String val5=values2.get(1).getAttribute("value");
		String val6=values2.get(2).getAttribute("value");
		
		values2.get(0).sendKeys("3");
		values2.get(1).sendKeys("00");
		values2.get(2).sendKeys("PM");
		
		WebElement submitouttime = driver.findElementById("Done");
		submitouttime.click();
		
		WebElement submitclocking = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Submit Manual Clocking\"]"));
		submitclocking.click();
		
		
	}
	
}
