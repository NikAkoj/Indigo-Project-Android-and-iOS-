package IndigoiOS.IndigoAutomation;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resource.utils.ListernersIndigoiOS;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class ForgotPasswordiOS extends ListernersIndigoiOS{
	
	
	@Test(priority=1)
	public void Trytogetresetpassword() throws MalformedURLException
	{
		IOSDriver<IOSElement> driver = setup();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Log into your Indigo account\"]"));
		login.click();
		
		WebElement uname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		uname.sendKeys("mis@narola.email");
		
		WebElement btncont = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncont.click();
		
		WebElement forgotpsw = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Forgot Password?\"]"));
		forgotpsw.click();
		
		WebElement getforgot = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Get Password Reset\"]"));
		getforgot.click();
		
		
	}
	
	@Test(priority=2)
	public void recoverwithinvaliduser() throws MalformedURLException
	{
		
		IOSDriver<IOSElement> driver = setup();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Log into your Indigo account\"]"));
		login.click();
		
		WebElement uname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		uname.sendKeys("mis@narola.email");
		
		WebElement btncont = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncont.click();
		
		WebElement forgotpsw = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Forgot Password?\"]"));
		forgotpsw.click();
		
		WebElement invaliduname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		invaliduname.sendKeys("invalid");
		
		WebElement getforgot = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Get Password Reset\"]"));
		getforgot.click();
		
		
	}
	
	@Test(priority=3)
	public void recoverwithvaliduser() throws MalformedURLException
	{
		
		IOSDriver<IOSElement> driver = setup();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Log into your Indigo account\"]"));
		login.click();
		
		WebElement uname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		uname.sendKeys("mis@narola.email");
		
		WebElement btncont = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncont.click();
		
		WebElement forgotpsw = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Forgot Password?\"]"));
		forgotpsw.click();
		
		WebElement validuname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		validuname.sendKeys("mis@narola.email");
		
		WebElement getforgot = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Get Password Reset\"]"));
		getforgot.click();
		
		
	}

}
