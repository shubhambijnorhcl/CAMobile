package com.CA.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



import com.CA.Base.TestBase;
import com.CA.Base.TestBase2;
import com.CA.utils.ReadConfig;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Login_via_US3 extends TestBase2{

	public AppiumDriver driver;

	public Login_via_US3(AppiumDriver driver) {
		// super();
    

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	static ReadConfig con=new ReadConfig();

	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
	public static WebElement loginbtn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[14]/XCUIElementTypeTextField")
	public WebElement username;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[16]/XCUIElementTypeSecureTextField")
	public WebElement password;

	@iOSXCUITFindBy(accessibility="Log in")
	public WebElement submit;
	
	@iOSXCUITFindBy(accessibility="Continue to App")
	public WebElement continueapp;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")
	public WebElement carousel;
	
	@iOSXCUITFindBy(accessibility = "Back")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"More\"`][1]")
	public WebElement Matches_more;
	
	@iOSXCUITFindBy(accessibility = "All Matches")
	public WebElement All_matches;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Follow a Team\"`]")
	public WebElement followteam;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSearchField")
	public WebElement search_followteam;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement team_select;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Next\"`]")
	public WebElement team_nextbtn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Enable notifications\"`]")
	public WebElement enable_notification;
	
	@iOSXCUITFindBy(accessibility = "Home")
	public WebElement Home_screen;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"More\"`][2]")
	public WebElement News_more;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public WebElement first_news;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"News\"`]")
	public WebElement News_page_back;
	
	@iOSXCUITFindBy(accessibility = "Back")
	public WebElement News_back;
	
	
	
	
	
	 public void testnew() throws Exception {
		 loginbtn.click();
		 Thread.sleep(3000);
		 
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

	 public void carouselscreen() throws Exception {
		Thread.sleep(2000);
			//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
			carousel.click();
			Thread.sleep(2000);
			backbtn.click();
		}
	 
	 public void more_btn() throws Exception {
		 Matches_more.click();
		 Thread.sleep(2000);
		 followteam.click();
//		 search_followteam.sendKeys("India");
//		 team_select.click();
		 team_nextbtn.click();
		 enable_notification.click();
		 //All_matches.click();
		 
	 }
	 
	 public void page() throws Exception {
		 Home_screen.click();
		 News_more.click();
		 first_news.click();
		 Thread.sleep(2000);
		 News_page_back.click();
		 Thread.sleep(2000);
		 News_back.click();
	 }
}
