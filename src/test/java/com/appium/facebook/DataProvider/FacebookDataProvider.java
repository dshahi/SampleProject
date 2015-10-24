package com.appium.facebook.DataProvider;

import org.testng.annotations.DataProvider;

public class FacebookDataProvider {
	
	
	@DataProvider(name="logindata")
	public static Object[][] getData(){
		
		Object[][]  obj=new Object[1][2];
		
		obj[0][0]="email";
		obj[0][1]="pass";
		
		return obj;
		
	}

}
