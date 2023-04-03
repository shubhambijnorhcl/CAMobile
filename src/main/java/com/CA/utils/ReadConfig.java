package com.CA.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {

		File src = new File("/Users/shubhamsrivastav/eclipse-workspace/CA_mobile/src/main/java/com/CA/utils/File.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is " + e.getMessage());
		}

	}
	
	public String GetPlatformName() {
		String platformName=pro.getProperty("platformName");
		return platformName;
	}

	public String GetAPIUrl() {

		String url = pro.getProperty("api_select");
		return url;

	}

	public String GetDeviceName() {
		String devicename=pro.getProperty("DeviceName");
		return devicename;
	}
	
	public String GetiOSVersion() {
		String iOSVersion=pro.getProperty("iOSversion");
		return iOSVersion;
	}
	
	public String GetAlert_login() {
		String Alert_login=pro.getProperty("Alert_login");
		return Alert_login;
		
	}
	public String Getusername() {
		String username=pro.getProperty("username");
		return username;
	}
	public String Getpassword() {
		String password=pro.getProperty("password");
		return password;
	}
	
	public String Getappium_url() {
		String appium_url=pro.getProperty("appium_url");
		return appium_url;
	}
	
	public String GetiOSmobilepath() {
		String iOSmobilepath=pro.getProperty("iOSmobilepath");
		return iOSmobilepath;
	}
	
	public String Getandroidpath() {
		String androidpath=pro.getProperty("androidpath");
		return androidpath;
	}
	public String Getteam_name() {
		String team_name=pro.getProperty("team_name");
		return team_name;
	}
	
}