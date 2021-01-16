package com.sauceDemo.utilities;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting extends TestListenerAdapter{

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void onStart(ITestContext testContext) {
	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+"repName.html");
	
	extent = new ExtentReports();
	
	extent.attachReporter(htmlReporter);
	ExtentTest logger = extent.createTest("LoginTest");
	}
	
	
}
