package com.TestCases;

import org.testng.annotations.Test;

import com.CA.Base.TestBase;
import com.CA.Videos.Videos;

public class Videos_TC extends Series_TC{

@Test	
	public void videos_section() throws Exception {
	Videos video=new Videos(driver);
	video.videoscreen(); 
		
	}
}
