package com.CA.Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CA.HomePage.HomePage;
import com.CA.login.Login_via_US2;
import com.CA.utils.ReadConfig;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase2 {

	public Properties pro;
	
	public static Login_via_US2 login;
	public static HomePage home;

	static ReadConfig con=new ReadConfig();
	public static AppiumDriver driver;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"https://uat-apiv2-cdn.ca-digi.com\"]")
	public static WebElement api_click;
	
	@iOSXCUITFindBy(accessibility="Allow")
	public static WebElement allow_btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start app with Selected properties...\"]")
	public static WebElement startapp;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	public static  WebElement continue_btn;
	
	@iOSXCUITFindBy(xpath = "App")
	public static WebElement Allow_Once;
    @BeforeClass
	public static AppiumDriver getDriver() throws Exception {
    	
    	String platformName=con.GetPlatformName();
	if (platformName.equalsIgnoreCase("Android")) {
	    // setup the android driver
		File appDir = new File("src/main/java");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Shubham");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		driver = new AndroidDriver(new URL(con.Getappium_url()), cap);
		}
	 else if (platformName.equalsIgnoreCase("iOS")) {
	    // setup the ios driver
		 XCUITestOptions options=new XCUITestOptions();
			options.setDeviceName(con.GetDeviceName());
			options.setPlatformVersion(con.GetiOSVersion());
			options.setWdaLaunchTimeout(Duration.ofSeconds(20));
			options.setCapability(MobileCapabilityType.APP,con.GetiOSmobilepath());
			
			driver=new IOSDriver(new URL(con.Getappium_url()),options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			login=new Login_via_US2(driver);
	}
	return driver;
	}
	@Test
	public void testbase() {
		
		driver.findElement(AppiumBy.accessibilityId("Allow")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther")).click();
	driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Start app with Selected properties...\"`]")).click();
	driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Continue\"`]")).click();
	//driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\\\"Allow Once\\\"]")).click();
	driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Allow Once\"`]")).click();
	
	}
//	 if(allow_btn.isEnabled()) {
//		 allow_btn.click();}
//		 else {System.out.println("Allow button doesnot exist");}
//		 
//		 api_click.click();
//		 startapp.click();
//		 
//		 if(continue_btn.isDisplayed()) {
//			 continue_btn.click();
//			 Allow_Once.click();
//		 }else {System.out.println("Continue btn doesnot exist");}
//		
//		 Thread.sleep(3000);
	
	
	
	
	
}
