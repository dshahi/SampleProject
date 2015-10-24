package com.appium.facebook.SampleProject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
AppiumDriver dr;
	
	
	@BeforeClass
	public void appiumSetup() throws MalformedURLException {
		
	    DesiredCapabilities  cap=new DesiredCapabilities();
	    cap.setCapability(CapabilityType.BROWSER_NAME, "");
	    cap.setCapability("deviceName", "Xperia SP");
	    cap.setCapability("platformVersion","4.3");
	    cap.setCapability("platformName","Android");
	 
	    
	    cap.setCapability("appPackage","com.android.calendar");
	    cap.setCapability("appActivity","LaunchActivity");
	    
	    dr=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    
	    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	
	@Test
	public void LongPressTest() throws InterruptedException{
		
		TouchAction act=new TouchAction(dr);
		
		act.longPress(576,630).perform();
	}
	
	
	@AfterTest
	public void closeDriver(){
		dr.quit();
	}
}
