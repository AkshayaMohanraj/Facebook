package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;
import com.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test//java//com//features//Facebook.feature"},
glue = {"com.stepdefinition"},
monochrome = true,
	dryRun = false,
	strict = true,
	tags= {"sanitytest","smoketest"})
//	plugin= {"html:Repot/Facebook_Report",
//			"pretty",
//			"json:Report/Facebook.json",
//			"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"})

public class Facebook_Testrunner {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void setup() throws Exception {
		
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver=Baseclass.Browserlaunch(browser);
	}
	
	@AfterClass
	public static void teardown() {
		
//		driver.close();
	}
	
 

}
