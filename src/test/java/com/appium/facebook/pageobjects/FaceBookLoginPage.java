package com.appium.facebook.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FaceBookLoginPage {
	
	public FaceBookLoginPage(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	
	@AndroidFindBy(id="com.facebook.katana:id/login_username")
	public WebElement emailfield;
	
	@AndroidFindBy(id="com.facebook.katana:id/login_password")
	public WebElement passwordfiled;
	
	@AndroidFindBy(id="com.facebook.katana:id/login_login")
	public WebElement logininbutton;
	
	@AndroidFindBy(id="com.facebook.katana:id/login_signup")
	public WebElement siguplink;

	@AndroidFindBy(id="android:id/button1")
	public WebElement okbutton;
	
	
	
	
	
	public void loginFacebook(String email,String password){

		emailfield.sendKeys(email);
		passwordfiled.sendKeys(password);
        logininbutton.click();
        okbutton.click();
	
	}
	
	
	

}
