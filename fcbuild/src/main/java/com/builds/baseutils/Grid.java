package com.builds.baseutils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid {
	@Test
	public static void runTestOnMachine(String browserName,String nodeip) throws MalformedURLException{
		
		//Make Hub
		//java -jar selenium-server-standalone-2.14.0.jar -role hub
		//Make Node
		//java -jar selenium-server-standalone-2.14.0.jar -role node  -hub http://localhost:4444/grid/register
		//String nodeurl = "localhost:4444/wd/hub";
		//To refine the list of available browsers, we can specify an additional -browser parameter when registering the node
		//java -jar selenium-server-standalone-2.42.0.jar -role node -browser browserName=safari -hub http://localhost:4444/grid/register
		
		//if we wanted to explicitly specify more than one browser.
		
		//java -jar selenium-server-standalone-2.42.0.jar -role node -browser browserName=safari -browser browserName=chrome -browser browserName=firefox -hub http://localhost:4444/grid/register
		browserName="firefox";
		
		nodeip="http://localhost:".concat("5555").concat("/wd/hub");
		
		DesiredCapabilities capability= new DesiredCapabilities();
		capability.setBrowserName(browserName);
		
		WebDriver driver= new RemoteWebDriver(new URL(nodeip), capability);
		driver.get("http://www.gmail.com");
	}
}
