package com.builds.baseutils;

import org.openqa.selenium.WebDriver;

public class Build {
	public static WebDriver driver;
	public static void setURL(String buildUrl){
		Build.driver.get(buildUrl);
	}
	
	
	
}
