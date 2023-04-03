package com.CA.utils;

import java.io.File;


import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	private static ExtentReports extent;
	
	
	public static ExtentReports getInstance(){
		
		if(extent==null){
			
			
			//extent = new ExtentReports(System.getProperty("user.dir")+"\\target\\surefire-reports\\extentReport.html",false,DisplayOrder.OLDEST_FIRST);
			extent=new ExtentReports(System.getProperty("user.dir")+"/target/surefire-reports/html/extentReport.html",true);
			extent.loadConfig(new File(System.getProperty("user.dir")+"/src/test/resources/extentconfig/ReportsConfig.xml"));
			
			
			
			
		}
		
		return extent;
		
	}

}
