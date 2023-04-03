package com.CA.HomePage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.CA.Base.TestBase;
import com.CA.utils.ReadConfig;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage{
	
	public AppiumDriver driver;
	
	public HomePage(AppiumDriver driver) {
		this.driver=driver;
    

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	static ReadConfig con=new ReadConfig();
	
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
//	private WebElement skipbtn;
	
	@iOSXCUITFindBy(accessibility ="Skip")
	public WebElement skipbtn;
	
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
	public WebElement carousel;
	
	@iOSXCUITFindBy(accessibility ="Home")
	public WebElement homebtn;
	
	@iOSXCUITFindBy(accessibility = "Back")
	public WebElement backbtn;
	
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"More\"`][2]")
	public WebElement TopStories_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Back\"`]")
	public WebElement TopStories_backbtn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeAny[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement newsclick;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"News\"`]")
	public WebElement newsback_btn;
	
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"LATEST VIDEO\"`]")
	public WebElement latestvideo;
	
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"More\"`][2]")
	public WebElement latestvideo_morbtn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"videoThumbnail\"`][2]")
	public WebElement videoplay;
	
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
	
	
	
	public void carouselscreen() {
		//System.out.println(skipbtn.getText());
		//skipbtn.click();
		System.out.println("%%%%%%%%%%%%%%%");
		carousel.click();
		backbtn.click();
		System.out.println("Test case: 9 -Home Carousel clicked successfully");
	}
	
	public void homescreen() throws Exception {
		TopStories_btn.click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		TopStories_backbtn.click();
		
		System.out.println("Test case:10-Top Stories clicked successfuly");
//Map<String, Object> params=new HashMap<>();
//params.put("direction","down");
//params.put("name", "LATEST VIDEO");
//driver.executeScript("mobile:scroll", params);
//latestvideo.click();

	}
	
//	public void matches() throws Exception {
//		matchesbtn.click();
//		matchesfilter.click();
//		Genderselect.click();
//		Thread.sleep(2000);
//		Format_type.click();
//		Thread.sleep(2000);
//		Filter_apply.click();
//		System.out.println("Test Case: 11: Matchs Filter clicked successfully");
//		Thread.sleep(3000);
//		matchesfilter.click();
//		Filter_reset.click();
//		Filter_apply.click();
//		
//		
//		//driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[31]")).click();
//		}
	
	
	

}
