package com.CA.utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.netty.util.concurrent.ImmediateExecutor;

public class IOSActions {
	
	IOSDriver driver;
	
	public IOSActions(IOSDriver driver) {
		this .driver=driver;
	}
public void longPressActions(WebElement ele) {
	Map<String, Object>params=new HashMap<>();
	params.put("element", ((RemoteWebElement)ele).getId());
	params.put("durtion",5);
	
	driver.execute("mobile:touchAndHold",params);
}

//public void scrollToEndAction() {
//	boolean canScrollMore;
//	do {
//		canScrollMore=(Boolean) ((JavascriptExecutor) drive).executeScript("mobile: scrollGesture", Immutable, null)
//	}
//}

public void scrollToWeb(WebElement ele) {
	Map<String,Object> params=new HashMap<>();
	params.put("direction", "down");
	params.put("element",((RemoteWebElement)ele).getId());
	
	driver.executeScript("mobile:scroll", params);
}

public void swipeAction(WebElement ele,String direction) {
	Map<String,Object> params1=new HashMap<>();
	params1.put("direction", "left");
	//params1.put("element",((RemoteWebElement)ele).getId());
	
	driver.executeScript("mobile:swipe", params1);
}
}