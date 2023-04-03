package com.CA.Series;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.CA.Base.TestBase;
import com.CA.utils.ReadConfig;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Series {
	
public AppiumDriver driver;

TestBase base=new TestBase();
	
	public Series(AppiumDriver driver) {
		this.driver=driver;
    

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	static ReadConfig con=new ReadConfig();
	
	@iOSXCUITFindBy(accessibility ="Matches")
	public WebElement matchesbtn;
	
	
	@iOSXCUITFindBy(accessibility = "All Series")
	private WebElement AllSeries;
	
	@iOSXCUITFindBy(accessibility = "Filter")
	private WebElement series_Filter;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"All\"`][1]")
	private WebElement filter_team;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSearchField")
	private WebElement team_search;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	private WebElement team_value_search;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Apply\"`]")
	private WebElement team_apply;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Apply\"`]")
	public WebElement Filter_apply;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Reset\"`]")
	private WebElement reset;
	public void series() throws Exception {

		
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//matchesbtn.click();
		AllSeries.click();
		series_Filter.click();
		filter_team.click();
		System.out.println("Test Case: 12: Filter by Team clicked successfully");
		team_search.sendKeys(base.decodeString(con.Getteam_name()));
		team_value_search.click();
		Thread.sleep(2000);
		team_apply.click();
		Filter_apply.click();
		Thread.sleep(3000);
		series_Filter.click();
		reset.click();
		team_apply.click();
		
		
	}
}
