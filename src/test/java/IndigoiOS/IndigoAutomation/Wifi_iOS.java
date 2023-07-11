package IndigoiOS.IndigoAutomation;

import java.net.MalformedURLException;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Resource.utils.ListernersIndigoiOS;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Wifi_iOS extends ListernersIndigoiOS{
	
public IOSDriver<IOSElement> driver;
	
	@Test(priority=1)
	public void TurnOnOffWifi() throws MalformedURLException, InterruptedException
	{
		
		IOSDriver<IOSElement> driver = setup();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
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
		
		driver.activateApp("com.apple.Preferences");

	        // Change the Date & Time
       changeDateTime(driver, "Jul", "4", "2023", "10", "30", "AM");
	}
	
	  private static void changeDateTime(IOSDriver<IOSElement> driver, String month, String day, String year, String hour, String minute, String ampm) {
	        // Open the Date & Time settings
	        IOSElement dateAndTime = driver.findElement(MobileBy.AccessibilityId("Date & Time"));
	        dateAndTime.click();

	        // Disable automatic date & time
	        IOSElement automaticToggle = driver.findElement(MobileBy.AccessibilityId("Set Automatically"));
	        boolean isAutomaticEnabled = Boolean.parseBoolean(automaticToggle.getAttribute("value"));

	        if (isAutomaticEnabled) {
	            automaticToggle.click();
	        }

	        // Set the date
	        IOSElement datePicker = driver.findElement(MobileBy.AccessibilityId("Date Picker"));
	         MobileElement monthPicker = datePicker.findElement(MobileBy.AccessibilityId(month));
	        monthPicker.click();
	        MobileElement dayPicker = datePicker.findElement(MobileBy.AccessibilityId(day));
	        dayPicker.click();
	        MobileElement yearPicker = datePicker.findElement(MobileBy.AccessibilityId(year));
	        yearPicker.click();

	        // Set the time
	        IOSElement timePicker = driver.findElement(MobileBy.AccessibilityId("Time Picker"));
	        MobileElement hourPicker = timePicker.findElement(MobileBy.AccessibilityId(hour));
	        hourPicker.click();
	        
	        MobileElement minutePicker = timePicker.findElement(MobileBy.AccessibilityId(minute));
	        minutePicker.click();
	        MobileElement ampmPicker = timePicker.findElement(MobileBy.AccessibilityId(ampm));
	        ampmPicker.click();
  
	        // Go back to the Settings main page 
	        driver.navigate().back();

	  }
}
