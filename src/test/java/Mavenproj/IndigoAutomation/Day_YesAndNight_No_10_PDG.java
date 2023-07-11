package Mavenproj.IndigoAutomation;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Day_YesAndNight_No_10_PDG extends BaseIndigo{

	
	@Test (priority = 1)
	public void PastDate() throws MalformedURLException, InterruptedException
	{
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log into your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log into your Indigo account']"));
		loginclick.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("pdg@narola.email");
				
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
		WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
		password.sendKeys("Check@123");
				
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
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='Allow only while using the app']")));
		WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='Allow only while using the app']"));
		btnpermission.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=\"My Schedule\"]/android.widget.TextView")));
		WebElement myschedule = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"My Schedule\"]/android.widget.TextView"));
		myschedule.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@index='0']")));
		WebElement dateclick = driver.findElement(By.xpath("//android.widget.TextView[@index='0']"));
		dateclick.click();
	
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=\"Clocking\"]")));
		WebElement clockingtab = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Clocking\"]"));
		clockingtab.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/rlAddManualClocking")));
		WebElement Addmanualclock = driver.findElement(By.id("com.shireburn.indigo:id/rlAddManualClocking"));
		Addmanualclock.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/ivManualIn")));
		WebElement selectclockin = driver.findElement(By.id("com.shireburn.indigo:id/ivManualIn"));
		selectclockin.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='8']")));
		WebElement selectinhour = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='16']"));
		selectinhour.click();
			
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='30']")));
		WebElement selectinmin = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='30']"));
		selectinmin.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/button1")));
		WebElement Submitstarttime = driver.findElement(By.id("android:id/button1"));
		Submitstarttime.click();
	
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/tvTomDate")));
		WebElement selectcurrentdate = driver.findElement(By.id("com.shireburn.indigo:id/tvTomDate"));
		selectcurrentdate.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/ivManualOut")));
		WebElement selectclockout = driver.findElement(By.id("com.shireburn.indigo:id/ivManualOut"));
		selectclockout.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='11']")));
		WebElement selectouthour = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='2']"));
		selectouthour.click();
			
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='45']")));
		WebElement selectoutmin = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='15']"));
		selectoutmin.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='OK']")));
		WebElement submitendtime = driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
		submitendtime.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Submit Manual Clocking']")));
		WebElement submitclocking = driver.findElement(By.xpath("//android.widget.TextView[@text='Submit Manual Clocking']"));
		submitclocking.click();
		
		Thread.sleep(5000);
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/imgBack")));
		WebElement back = driver.findElement(By.id("com.shireburn.indigo:id/imgBack"));
		back.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Today-Tue 13 Jun']")));
		WebElement dateclick1 = driver.findElement(By.xpath("//android.widget.TextView[@text='Today-Tue 13 Jun']"));
		dateclick1.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=\"Clocking\"]")));
		WebElement clockingtab1 = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Clocking\"]"));
		clockingtab1.click();
		
		System.out.println("Clock out is showing in current date");
		
	}
	

}
