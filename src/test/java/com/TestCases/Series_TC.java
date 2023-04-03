package com.TestCases;

import org.testng.annotations.Test;

import com.CA.Series.Series;

public class Series_TC extends Matches_TC{
	
	@Test(priority = 3)
	public void filterseries() throws Exception {
		
		Series ser=new Series(driver);
		ser.series();
		//System.out.println("Test Case: 12: Series Filter clicked successfully");
		
		
	}

}
