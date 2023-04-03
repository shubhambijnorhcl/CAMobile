package com.TestCases;

import org.testng.annotations.Test;

import com.CA.Base.TestBase;
import com.CA.HomePage.HomePage;
//import com.CA.HomePage.HomePage;
import com.CA.utils.ReadConfig;

import io.appium.java_client.AppiumDriver;

public class Homepage_TC extends TestBase{
	
	static ReadConfig con=new ReadConfig();
	//public AppiumDriver driver;
	public HomePage homeee;
	
	
	
	
	@Test(priority=1)
	public void homepage() throws Exception {
		//System.out.println(con.GetPlatformName());
		//Login_US2 login1=new Login_US2();
		//login1.loginpage();
		homeee=new HomePage(driver);
		homeee.carouselscreen();
		homeee.homescreen();
		//homeee.matches();
	
	}
	
	
	
	

}
