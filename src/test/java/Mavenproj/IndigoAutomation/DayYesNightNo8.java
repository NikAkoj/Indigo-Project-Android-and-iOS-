package Mavenproj.IndigoAutomation;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DayYesNightNo8 extends BaseIndigo {
	
	
	@Test (priority = 1)
	public void manualclockinat08am() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log into your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log into your Indigo account']"));
		loginclick.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("mis@narola.email");
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
		WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
		password.sendKeys("Narol@123!!!");
				
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
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.ImageView")));
		WebElement myschedule = driver.findElement(By.className("android.widget.ImageView"));
		myschedule.click();
		
		Thread.sleep(2000);
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@index='0']")));
		WebElement dateclick = driver.findElement(By.xpath("//android.widget.TextView[@index='0']"));
		dateclick.click();
		
		Thread.sleep(2000);
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Today']")));
		WebElement todaydate = driver.findElement(By.xpath("//android.widget.TextView[@text='Today']"));
		todaydate.click();
		
		Thread.sleep(2000);
		
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
		WebElement selectinhour = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='10']"));
		selectinhour.click();
			
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='30']")));
		WebElement selectinmin = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='30']"));
		selectinmin.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
		WebElement Submitstarttime = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
		Submitstarttime.click();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.TextView")));
		WebElement tomorrowdate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
		tomorrowdate.click();
			
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")));
		WebElement submitclocking = driver.findElement(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
		submitclocking.click();
		

		
//      To turn OFF WIFI		
//	    NetworkConnection mobileDriver = (NetworkConnection) driver;
//	    if (mobileDriver.getNetworkConnection() != ConnectionType.NONE) {
//	        enabling Airplane mode
//	       mobileDriver.setNetworkConnection(ConnectionType.NONE);
//	    }
        
		System.out.println("Past date manual clocking entry added successfully");

	}
	
	
//	public void turnOffWifi() throws Exception {
//	    AndroidDriver driver = null;
//		((AndroidDriver) driver).toggleWifi();
//	}


	
	
	@Test (priority = 2)
	public void Addmanualclocking() throws MalformedURLException, InterruptedException
	
	{
		
		AndroidDriver<AndroidElement> driver = capabilities();
//		AppiumDriver driver;    


//		    NetworkConnection mobileDriver = (NetworkConnection) driver;
//		    if (mobileDriver.getNetworkConnection() != ConnectionType.NONE) {
//		       // enabling Airplane mode
//		       mobileDriver.setNetworkConnection(ConnectionType.NONE);
//		    }
	
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log into your Indigo account']")));
			WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log into your Indigo account']"));
			loginclick.click();
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
			WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
			username.sendKeys("mis@narola.email");
					
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
			WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
			btncontinue.click();
					
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
			WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
			password.sendKeys("Narol@123!!!");
					
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
			WebElement btnsubmit = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
			btnsubmit.click();
					
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='AGREE']")));
			WebElement btnagree = driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']"));
			btnagree.click();
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode1")));
			WebElement firstcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode1"));
			firstcode.sendKeys("1");
			
			Thread.sleep(2000);
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode2")));
			WebElement secondcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode2"));
			secondcode.sendKeys("2");
			
			Thread.sleep(2000);
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode3")));
			WebElement thirdcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode3"));
			thirdcode.sendKeys("3");
			
			Thread.sleep(2000);
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode4")));
			WebElement fourthcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode4"));
			fourthcode.sendKeys("4");
		
			Thread.sleep(2000);
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textSetAccessCode")));
			WebElement btnsetaccess = driver.findElement(By.id("com.shireburn.indigo:id/textSetAccessCode"));
			btnsetaccess.click();
					
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Allow Access']")));
			WebElement btnallow = driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']"));
			btnallow.click();
					
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='WHILE USING THE APP']")));
			WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='WHILE USING THE APP']"));
			btnpermission.click();
			
			Thread.sleep(2000);
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.ImageView")));
			WebElement myschedule = driver.findElement(By.className("android.widget.ImageView"));
			myschedule.click();
			
			Thread.sleep(2000);
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@index='0']")));
			WebElement dateclick = driver.findElement(By.xpath("//android.widget.TextView[@index='0']"));
			dateclick.click();
			
			Thread.sleep(2000);
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Today']")));
			WebElement todaydate = driver.findElement(By.xpath("//android.widget.TextView[@text='Today']"));
			todaydate.click();
			
			Thread.sleep(2000);
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=\"Clocking\"]")));
			WebElement clockingtab = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Clocking\"]"));
			clockingtab.click();
			
			Thread.sleep(2000);
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/rlAddManualClocking")));
			WebElement Addmanualclock = driver.findElement(By.id("com.shireburn.indigo:id/rlAddManualClocking"));
			Addmanualclock.click();
			
			Thread.sleep(2000);
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/ivManualOut")));
			WebElement selectclockout = driver.findElement(By.id("com.shireburn.indigo:id/ivManualOut"));
			selectclockout.click();
			
			Thread.sleep(2000);
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='11']")));
			WebElement selectouthour = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='10']"));
			selectouthour.click();
				
			Thread.sleep(2000);
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='45']")));
			WebElement selectoutmin = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='45']"));
			selectoutmin.click();
			
			Thread.sleep(2000);
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/button1")));
			WebElement Submitstarttime = driver.findElement(By.id("android:id/button1"));
			Submitstarttime.click();
			
			Thread.sleep(2000);
			
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Submit Manual Clocking']")));
			WebElement submitclocking = driver.findElement(By.xpath("//android.widget.TextView[@text='Submit Manual Clocking']"));
			submitclocking.click();
	}
	

}
