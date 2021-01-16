package com.sauceDemo.testCases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sauceDemo.pageObjects.LoginPage;

public class TC_LoginTest001 extends BaseClass{

	@Test
	public void LoginTest() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.txtUsername();
		logger.info("Entered Username");
		
		loginPage.txtPassword();
		logger.info("Entered Password");
		
		loginPage.btnLogin();
		logger.info("Clicked to Login");
		logger.info("Login successfull!!");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());//time stamp
		String repName = "Test-Report-"+timeStamp+".html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+repName);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest logger = extent.createTest("LoginTest");
		
		if(driver.getTitle().equals("Swag Labs"))
		{
			Assert.assertTrue(true);
			logger.info("Expected Url Opened!!");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Unexpected Url Opened!!");
		}
		logger.log(Status.INFO, "Title verified");
		
		extent.flush();
	}
	
}
