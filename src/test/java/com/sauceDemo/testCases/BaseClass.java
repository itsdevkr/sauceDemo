package com.sauceDemo.testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sauceDemo.utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	public static Logger logger;
	
	ReadConfig readConfig = new ReadConfig();
	
	@BeforeClass
	
	public void setup() {

		System.setProperty("webdriver.chrome.driver",readConfig.getChromepath());
		driver = new ChromeDriver();
		driver.get(readConfig.getApplicationURL());
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		driver.manage().deleteAllCookies();
	}
	
}
