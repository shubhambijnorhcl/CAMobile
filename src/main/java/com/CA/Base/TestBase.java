package com.CA.Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CA.HomePage.HomePage;
import com.CA.listeners.ExtentReporterNG;
import com.CA.login.Login_via_US2;
import com.CA.utils.ExtentManager;
import com.CA.utils.ReadConfig;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class TestBase extends ExtentReporterNG{

	public Properties pro;
	
	public static ExtentTest test;
	public ExtentReports rep=ExtentManager.getInstance();
	
public static AppiumDriverLocalService service;
	static ReadConfig con=new ReadConfig();
	public static AppiumDriver driver;
    @BeforeClass
	public static AppiumDriver getDriver() throws Exception {
//    	service=new AppiumServiceBuilder().withAppiumJS(new File("//usr//local/lib/node_modules/appium//build/lib/main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
//    			service.start();
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
			//options.setCapability(MobileCapabilityType.NO_RESET, true);
			
			driver=new IOSDriver(new URL(con.Getappium_url()),options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(AppiumBy.accessibilityId("Allow")).click();
			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Start app with Selected properties...\"`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Continue\"`]")).click();
		//driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\\\"Allow Once\\\"]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Allow Once\"`]")).click();
		WebElement skip=driver.findElement(AppiumBy.accessibilityId("Skip"));
		WebElement login=driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Log In\"]"));
		System.out.println(con.GetAlert_login());
		//Assert.assertEquals(skip.getText(), con.GetAlert_login());
		if(skip.getText().equalsIgnoreCase(con.GetAlert_login())) {
			skip.click();
			System.out.println("Skip button is clicked");
		}else if(login.getText().equalsIgnoreCase(con.GetAlert_login())) {
			login.click();
			System.out.println("Login button is clicked");
		}
		
		
		
		
	}
	return driver;
	}
    
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//		service.stop();
//	}
    
    public void test() {
    	System.out.println("Test test");
    }
    
    public static String decodeString(String password) {
    	
    	byte[] decodeString=Base64.decodeBase64(password);
		return (new String(decodeString));
    	
    }
public static String encodeString(String abc) {
    	
    	byte[] encodeString=Base64.encodeBase64(abc.getBytes());
		return (new String(encodeString));
    	
    }
    
}
