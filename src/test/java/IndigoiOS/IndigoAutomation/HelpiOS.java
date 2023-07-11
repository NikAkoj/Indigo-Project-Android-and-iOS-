package IndigoiOS.IndigoAutomation;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resource.utils.ListernersIndigoiOS;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HelpiOS extends ListernersIndigoiOS{
	
	@Test
	public void viewhelp() throws InterruptedException, MalformedURLException
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
		
		WebElement allowaccess = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Allow Access\"]"));
		allowaccess.click();
		
		WebElement allowlocation = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow While Using App\"]"));
		allowlocation.click();
		
		WebElement btnmore = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"More\"]"));
		btnmore.click();
		
		WebElement help = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Help\"]"));
		help.click();
		
		Thread.sleep(20000);
		Dimension dimension = driver.manage().window().getSize();
		
		int start_x = (int) (dimension.width * 0.8);
		int start_y = (int) (dimension.height * 0.5);
		
		int end_x = (int) (dimension.width * 0.2);
		int end_y = (int) (dimension.height * 0.2);
		
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
		
		//For scroll up the screen
		Thread.sleep(5000);
		dimension = driver.manage().window().getSize();
		
		start_x = (int) (dimension.width * 0.8);
		start_y = (int) (dimension.height * 0.2);
		
		end_x = (int) (dimension.width * 0.2);
		end_y = (int) (dimension.height * 0.5);
		
		touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
			
//		WebElement backkey = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ic white back\"]"));
//		backkey.click();
		
		Thread.sleep(3000);
		
		String bundleId = "com.shireburn.indigo";
	    driver.activateApp(bundleId);
	        
	    Thread.sleep(5000);
	    
	    WebElement firstcode1 = driver.findElement(By.xpath("(//XCUIElementTypeImage[@name=\"svg_ic_round_bg_passcode\"])[1]"));
		firstcode1.click();
		
		WebElement secondcode1 = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"2\"]"));
		secondcode1.click();
		
		WebElement thirdcode1 = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"3\"]"));
		thirdcode1.click();
		
		WebElement fourthcode1 = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"4\"]"));
		fourthcode1.click();
	        
		WebElement profilepic = driver.findElement(By.xpath("//XCUIElementTypeButton[@index=\"1\" and @x=\"347\"]"));
		profilepic.click();
		
		WebElement logout = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Logout\"]"));
		logout.click();
		
		WebElement confirmlogout = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Log out\"]"));
		confirmlogout.click();
		
		}

}
