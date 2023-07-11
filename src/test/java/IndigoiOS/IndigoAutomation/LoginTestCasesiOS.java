package IndigoiOS.IndigoAutomation;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resource.utils.ListernersIndigoiOS;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class LoginTestCasesiOS extends ListernersIndigoiOS{
	

	
	@Test(priority = 1)
	public void loginwithoutusername() throws MalformedURLException
	{
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		IOSDriver<IOSElement> driver = setup();
		
		//new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name=\\\"Log into your Indigo account\\\"]")));
		WebElement login = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Log into your Indigo account\"]"));
		login.click();
		
		WebElement btncont = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncont.click();
		
	
		
	}

		
	@Test(priority = 2)
	public void loginwithoutpassword() throws MalformedURLException
	{
		
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		IOSDriver<IOSElement> driver = setup();
		
		WebElement login = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Log into your Indigo account\"]"));
		login.click();
		
		WebElement uname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		uname.sendKeys("indigo@gmail.com");
		
		WebElement btncont = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncont.click();
		
		WebElement btnsubmit = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btnsubmit.click();
		
	}

	@Test(priority=3)
	public void invalidlogin() throws MalformedURLException
	{
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		IOSDriver<IOSElement> driver = setup();
		
		WebElement login = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Log into your Indigo account\"]"));
		login.click();
		
		WebElement uname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		uname.sendKeys("indigo@gmail.com");
		
		WebElement btncont = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncont.click();
		
		WebElement password = driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Password\"]"));
		password.sendKeys("indigopass");
		
		WebElement btnsubmit = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btnsubmit.click();
		
	}

	@Test(priority=4)
	public void showpassword() throws MalformedURLException
	{
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		IOSDriver<IOSElement> driver = setup();
		
		WebElement login = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Log into your Indigo account\"]"));
		login.click();
		
		WebElement uname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		uname.sendKeys("indigo@gmail.com");
		
		WebElement btncont = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncont.click();
		
		WebElement password = driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Password\"]"));
		password.sendKeys("indigopass");
		
		WebElement btnshow = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ic eye\"]"));
		btnshow.click();
		
		System.out.println("Password shown");
	}

	@Test(priority = 5)
	public void login() throws MalformedURLException
	{
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
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
			

	}
	
}
