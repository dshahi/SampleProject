package com.appium.facebook.SampleProject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.facebook.pageobjects.FaceBookLoginPage;

public class Facebook {
 public static AppiumDriver dr;

	@BeforeTest
	public void appiumSetup() throws MalformedURLException {
		
	    DesiredCapabilities  cap=new DesiredCapabilities();
	    cap.setCapability(CapabilityType.BROWSER_NAME, "");
	    cap.setCapability("deviceName", "Xperia SP");
	    cap.setCapability("platformVersion","4.3");
	    cap.setCapability("platformName","Android");
	 
	    cap.setCapability("appPackage","com.facebook.katana");
	    cap.setCapability("appActivity","LoginActivity");
	    
	    dr=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	
	@Test
	public void LoginTest() throws InterruptedException{
		Thread.sleep(5000);
		FaceBookLoginPage login=new FaceBookLoginPage(dr);
		login.loginFacebook("email","pass");

	}
	
	
	@AfterTest
	public void closeDriver(){
		dr.quit();
	}
}
