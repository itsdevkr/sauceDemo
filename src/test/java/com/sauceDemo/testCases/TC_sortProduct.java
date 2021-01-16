package com.sauceDemo.testCases;

import org.testng.annotations.Test;

import com.sauceDemo.pageObjects.ProductPage;

public class TC_sortProduct extends BaseClass{

	@Test
	public void sort() {
		
		TC_LoginTest001 loginTest = new TC_LoginTest001();
		loginTest.LoginTest();
		
		ProductPage productPage = new ProductPage();
		productPage.lblProduct().isDisplayed();
		logger.info("Product Page is Displayed");
		
		productPage.containerProductSort().click();
		logger.info("Clicked for Sorting Product");
		
		productPage.sortByLowToHigh().click();
		logger.info("Clicked on Price Low to High");
		logger.info("Price Low to High is successfull!!");
		
	}
	

	
	
}
