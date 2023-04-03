package com.CA.login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



import com.CA.Base.TestBase;
import com.CA.utils.ReadConfig;

import io.appium.java_client.ios.IOSDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Login_via_Gmail extends TestBase {

	public IOSDriver driver;

	public Login_via_Gmail(IOSDriver driver) {
		// super();
    

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	static ReadConfig con=new ReadConfig();
	

	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"https://uat-apiv2-cdn.ca-digi.com\"]")
	public WebElement api_click;
	
	@iOSXCUITFindBy(accessibility="Allow")
	public WebElement allow_btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start app with Selected properties...\"]")
	public WebElement startapp;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement continue_btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow Once\"]")
	public WebElement Allow_Once;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
	public WebElement loginbtn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[14]/XCUIElementTypeTextField")
	public WebElement username;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[16]/XCUIElementTypeSecureTextField")
	public WebElement password;

	@iOSXCUITFindBy(accessibility="Log in")
	public WebElement submit;
	
	@iOSXCUITFindBy(accessibility="Continue to App")
	public WebElement continueapp;
	

	
	 public void test() {
		 
		 if(allow_btn.isEnabled()) {
		 allow_btn.click();}
		 else {System.out.println("Allow button doesnot exist");}
		 
		 api_click.click();
		 startapp.click();
		 
		 if(continue_btn.isDisplayed()) {
			 continue_btn.click();
			 Allow_Once.click();
		 }else {System.out.println("Continue btn doesnot exist");}
		 loginbtn.click();
		 
	 }
	 
	 public void logintest(String uname, String pwd) { 
		  username.sendKeys(uname);
		  password.sendKeys(pwd);
		  }
	 
	 public void submitbtn() {
		 submit.click();
		 
		}

	 public void clear() {
		 username.click();
			username.clear();
		

		}
	 
	 public void continuebtn() {
		 continueapp.click();
	 }

}
