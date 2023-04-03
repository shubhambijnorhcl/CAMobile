package com.TestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.CA.Base.TestBase;
import com.CA.matches.Match;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class Matches_TC extends Homepage_TC{
	
	
	
	
	//public Homepage_TC home;
	@Test(priority = 2)
	public void filter() throws Exception {
//		home=new Homepage_TC();
//		home.homepage();
		Match matchs=new Match(driver);
		matchs.matches();

		
		
	}

	
	

}
