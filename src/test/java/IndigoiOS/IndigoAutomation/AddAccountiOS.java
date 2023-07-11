package IndigoiOS.IndigoAutomation;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resource.utils.ListernersIndigoiOS;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class AddAccountiOS extends ListernersIndigoiOS{
	
	
	@Test(priority=1)
	public void addaccount() throws MalformedURLException
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
		
		WebElement profilepic = driver.findElement(By.xpath("//XCUIElementTypeButton[@index=\"1\" and @x=\"347\"]"));
		profilepic.click();
		
		WebElement btnadd = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Add Account\"]"));
		btnadd.click();
		
		WebElement adduname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Username\"]"));
		adduname.sendKeys("pdg@narola.email");
		
		WebElement btncontinue = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncontinue.click();
		
		WebElement addpsw = driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Password\"]"));
		addpsw.sendKeys("Check@123");
		
		WebElement btncontinue2 = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
		btncontinue2.click();
		
		WebElement viewterms = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"View Terms\"]"));
		viewterms.click();
		
		WebElement acceptterms = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Accept\"]"));
		acceptterms.click();
		
		WebElement newprofile = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Indigo\"]"));
		newprofile.click();
		
	    System.out.println("Visible Dashboard screen");
		
	}

}
