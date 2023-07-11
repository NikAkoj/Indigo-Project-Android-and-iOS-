package Mavenproj.IndigoAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DyaAndNight0 extends BaseIndigo {


	@Test(priority=1)
	public void manualclockinat01am() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log into your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log into your Indigo account']"));
		loginclick.click();
		 
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("ngu@narola.email");
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();
				 
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
		WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
		password.sendKeys("Narola@123!!!");
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
		WebElement btnsubmit = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
		btnsubmit.click();
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='AGREE']")));
		WebElement btnagree = driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']"));
		btnagree.click();
		 
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode1")));
		WebElement firstcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode1"));
		firstcode.sendKeys("1");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode2")));
		WebElement secondcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode2"));
		secondcode.sendKeys("2");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode3")));
		WebElement thirdcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode3"));
		thirdcode.sendKeys("3");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode4")));
		WebElement fourthcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode4"));
		fourthcode.sendKeys("4");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textSetAccessCode")));
		WebElement btnsetaccess = driver.findElement(By.id("com.shireburn.indigo:id/textSetAccessCode"));
		btnsetaccess.click();
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Allow Access']")));
		WebElement btnallow = driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']"));
		btnallow.click();
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='While using the app']")));
		WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='While using the app"));
		btnpermission.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=\"My Schedule\"]/android.widget.TextView")));
		WebElement myschedule = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"My Schedule\"]/android.widget.TextView"));
		myschedule.click();
		
	//	driver.toggleWifi();
	
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@index='0']")));
		WebElement dateclick = driver.findElement(By.xpath("//android.widget.TextView[@index='0']"));
		dateclick.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Today']")));
		WebElement todaydate = driver.findElement(By.xpath("//android.widget.TextView[@text='Today']"));
		todaydate.click();
			
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=\"Clocking\"]")));
		WebElement clockingtab = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Clocking\"]"));
		clockingtab.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Today']")));
		WebElement todaydate1 = driver.findElement(By.xpath("//android.widget.TextView[@text='Today']"));
		todaydate1.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/rlAddManualClocking")));
		WebElement Addmanualclock = driver.findElement(By.id("com.shireburn.indigo:id/rlAddManualClocking"));
		Addmanualclock.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/ivManualIn")));
		WebElement selectclockin = driver.findElement(By.id("com.shireburn.indigo:id/ivManualIn"));
		selectclockin.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='8']")));
		WebElement selectinhour = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='8']"));
		selectinhour.click();
			
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='30']")));
		WebElement selectinmin = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='30']"));
		selectinmin.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/button1")));
		WebElement Submitstarttime = driver.findElement(By.id("android:id/button1"));
		Submitstarttime.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/ivManualOut")));
		WebElement selectclockout = driver.findElement(By.id("com.shireburn.indigo:id/ivManualOut"));
		selectclockout.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='11']")));
		WebElement selectouthour = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='11']"));
		selectouthour.click();
			
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='45']")));
		WebElement selectoutmin = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='45']"));
		selectoutmin.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='OK']")));
		WebElement submitendtime = driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
		submitendtime.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
		WebElement submitclocking = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
		submitclocking.click();
		
		System.out.println("Past date manual clocking entry added successfully");
		
	}
	
	
//	@Test(priority=2)
	public void Addmanualclocking() throws MalformedURLException, InterruptedException
	{
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log into your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log into your Indigo account']"));
		loginclick.click();
		 
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("ngu@narola.email");
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();
				 
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
		WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
		password.sendKeys("Narola@123!!!");
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
		WebElement btnsubmit = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
		btnsubmit.click();
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='AGREE']")));
		WebElement btnagree = driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']"));
		btnagree.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode1")));
		WebElement firstcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode1"));
		firstcode.sendKeys("1");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode2")));
		WebElement secondcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode2"));
		secondcode.sendKeys("2");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode3")));
		WebElement thirdcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode3"));
		thirdcode.sendKeys("3");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode4")));
		WebElement fourthcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode4"));
		fourthcode.sendKeys("4");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textSetAccessCode")));
		WebElement btnsetaccess = driver.findElement(By.id("com.shireburn.indigo:id/textSetAccessCode"));
		btnsetaccess.click();
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Allow Access']")));
		WebElement btnallow = driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']"));
		btnallow.click();
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='While using the app']")));
		WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']"));
		btnpermission.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=\"My Schedule\"]/android.widget.TextView")));
		WebElement myschedule = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"My Schedule\"]/android.widget.TextView"));
		myschedule.click();
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@index='0']")));
		WebElement dateclick = driver.findElement(By.xpath("//android.widget.TextView[@index='0']"));
		dateclick.click();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Today']")));
		WebElement todaydate = driver.findElement(By.xpath("//android.widget.TextView[@text='Today']"));
		todaydate.click();
			
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=\"Clocking\"]")));
		WebElement clockingtab = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Clocking\"]"));
		clockingtab.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Today']")));
		WebElement todaydate1 = driver.findElement(By.xpath("//android.widget.TextView[@text='Today']"));
		todaydate1.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/rlAddManualClocking")));
		WebElement Addmanualclock = driver.findElement(By.id("com.shireburn.indigo:id/rlAddManualClocking"));
		Addmanualclock.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/tvClockInDateTxt\r\n"
				+ "")));
		String clockout = driver.findElement(By.id("com.shireburn.indigo:id/tvClockInDateTxt\r\n"+ "")).getText();
		Assert.assertEquals(clockout, "Clocked in on:");
	
		System.out.println("User has already Clocked in");	
		
	}

	

}
