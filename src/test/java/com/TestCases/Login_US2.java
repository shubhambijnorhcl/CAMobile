package com.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import com.CA.Base.TestBase;

import com.CA.login.Login_via_US2;
import com.CA.utils.ReadConfig;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;



public class Login_US2 extends TestBase{
	
	//public IOSDriver driver;
	static ReadConfig con=new ReadConfig();
	//public AppiumDriver driver;
	//public TestBase base;
	public Login_via_US2 logintest;
	
	@Test(priority = 1)
	public void loginpage() throws Exception {
		System.out.println(con.GetPlatformName());
		logintest=new Login_via_US2(driver);
		
		
	     Thread.sleep(5000);
		logintest.loginclick();
		Thread.sleep(2000);
	     
		//logintest.logintest(con.Getusername(), con.Getpassword());
		logintest.logintest(con.Getusername());
	     logintest.submitbtn();
	     logintest.continuebtn();
	}
	
//	@Test(dependsOnMethods = "loginpage")
//	public void careousel() throws Exception {
//		logintest.carouselscreen();
//		logintest.more_btn();
//		//login.page();
//	
//	}
	
	

	

}
