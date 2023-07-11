package IndigoiOS.IndigoAutomation;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.ElementOption;

public class SlidetoclockingiOS extends BaseIndigoiOS{
	
	@Test
	public void slidetoclocking() throws MalformedURLException, InterruptedException
	{
		IOSDriver<IOSElement> driver = setup();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Log into your Indigo account\"]"));
		login.click();
		
		WebElement uname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		uname.sendKeys("mis@narola.email");
		
		WebElement btncont = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncont.click();
		
		WebElement password = driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Password\"]"));
		password.sendKeys("Narol@123!!!");
		
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
		
		WebElement currdate = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Today-Tue 27 Jun\"]"));
		currdate.click();
		
		WebElement clocking = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Clocking\"]"));
		clocking.click();
		
		WebElement clockin = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ic svg clocking in\"]"));
		clockin.click();
		
		WebElement slidetoclock = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Indigo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton"));
		
		Thread.sleep(5000);
		
		TouchAction action=new TouchAction((IOSDriver) driver);
	       
        action.longPress(ElementOption.element(slidetoclock)).moveTo(ElementOption.element(slidetoclock,500,500)).release().perform();
		
        System.out.println("Clock in entry added");
        
        Thread.sleep(10000);
        
        WebElement clockout = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ic svg clocking out\"]"));
		clockout.click();
        
		WebElement slideclockout = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Indigo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton"));
         
		TouchAction actions=new TouchAction((IOSDriver) driver);
	       
        actions.longPress(ElementOption.element(slideclockout)).moveTo(ElementOption.element(slideclockout,500,500)).release().perform();
		
        System.out.println("Clock out entry added");
        
	}

}
