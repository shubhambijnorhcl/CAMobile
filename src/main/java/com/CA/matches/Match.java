package com.CA.matches;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.CA.utils.ReadConfig;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Match {
	public AppiumDriver driver;

	public Match(AppiumDriver driver) {
		this.driver=driver;
	    

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	static ReadConfig con=new ReadConfig();
	
	@iOSXCUITFindBy(accessibility ="Matches")
	public WebElement matchesbtn;
	
	@iOSXCUITFindBy(accessibility ="Filter")
	public WebElement matchesfilter;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"radio button unchecked\"`][2]")
	public WebElement Genderselect;
	
	
	@iOSXCUITFindBy(accessibility ="test")
	public WebElement Format_type;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Apply\"`]")
	public WebElement Filter_apply;
	

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Reset\"`]")
	public WebElement Filter_reset;
	
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \" \"`]")
	private WebElement match_datepiker;
	
	
	public void matches() throws Exception {
		matchesbtn.click();
		matchesfilter.click();
		Genderselect.click();
		//Thread.sleep(2000);
		Format_type.click();
		//Thread.sleep(2000);
		Filter_apply.click();
		System.out.println("Test Case: 11: Matchs Filter clicked successfully");
		Thread.sleep(3000);
		matchesfilter.click();
		Filter_reset.click();
		Filter_apply.click();
		
		
		//driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[31]")).click();
		
	}
	
	
	
	
	

}
