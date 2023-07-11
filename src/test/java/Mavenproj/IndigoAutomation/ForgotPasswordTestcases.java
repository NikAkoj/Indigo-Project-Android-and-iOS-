package Mavenproj.IndigoAutomation;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resource.utils.ListernersIndigoAndroid;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ForgotPasswordTestcases extends ListernersIndigoAndroid{
	
	
	@Test(priority = 1)
	public void Trytogetresetpassword() throws MalformedURLException
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
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/txtRecoverPassword")));
		WebElement forgotpassword = driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPassword"));
		forgotpassword.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textRecoverPassword")));
		WebElement getpasswordreset = driver.findElement(By.id("com.shireburn.indigo:id/textRecoverPassword"));
		getpasswordreset.click();
		
		System.out.println("Username is required.");
		
	}
	
	@Test(priority=2)
	public void Recoverwithinvaliduser() throws MalformedURLException
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
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/txtRecoverPassword")));
		WebElement forgotpassword = driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPassword"));
		forgotpassword.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement invaliduser = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		invaliduser.sendKeys("invalidusername");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textRecoverPassword")));
		WebElement getpasswordreset = driver.findElement(By.id("com.shireburn.indigo:id/textRecoverPassword"));
		getpasswordreset.click();
		
		System.out.println("Invalid user");
		
	}
	
	@Test(priority=3)
	public void Recoverwithvaliduser() throws MalformedURLException
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
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/txtRecoverPassword")));
		WebElement forgotpassword = driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPassword"));
		forgotpassword.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement invaliduser = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		invaliduser.sendKeys("mis@narola.email");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textRecoverPassword")));
		WebElement getpasswordreset = driver.findElement(By.id("com.shireburn.indigo:id/textRecoverPassword"));
		getpasswordreset.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/txtRecoverPasswordSentMsg1")));
		String confirmmessage = driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPasswordSentMsg1")).getText();
		Assert.assertEquals(confirmmessage, "A new link to change your password has been sent to your Indigo account email.");
	}

}
