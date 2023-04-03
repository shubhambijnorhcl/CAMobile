package com.CA.Videos;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.CA.Base.TestBase;
import com.CA.utils.ReadConfig;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Videos {
	
	public AppiumDriver driver;

	//TestBase base=new TestBase();
		
		public Videos(AppiumDriver driver) {
			this.driver=driver;
	    

			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		static ReadConfig con=new ReadConfig();
		
		
		@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Video\"`]")
		public WebElement video;
		
		@iOSXCUITFindBy(accessibility = "Filter")
		private WebElement video_filter;
		
		@iOSXCUITFindBy(accessibility = "Australia")
		private WebElement team_Australia;
		
		@iOSXCUITFindBy(accessibility = "India")
		private WebElement team_India;
		
		@iOSXCUITFindBy(accessibility = "Done")
		private WebElement Done;
		

		@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"play-circle\"`][2]")
		public WebElement video_click;
		
		
		public void videoscreen() throws Exception {
			video.click();
			video_filter.click();
			team_Australia.click();
			Map<String,Object> scrolldown=new HashMap<>();
			scrolldown.put("direction","down");
			scrolldown.put("element", ((RemoteWebElement)team_India).getId());
			driver.executeScript("mobile:scroll", scrolldown);
			Thread.sleep(2000);
			team_India.click();
			team_India.click();
			Done.click();
			Thread.sleep(2000);
			video_click.click();
			
		}

}
