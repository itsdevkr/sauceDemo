package com.sauceDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauceDemo.testCases.BaseClass;
import com.sauceDemo.utilities.ReadConfig;

public class LoginPage extends BaseClass{

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//input[@id='user-name']")
	private WebElement txtUsername;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnLogin;
	
	ReadConfig readConfig = new ReadConfig();
	
	public void txtUsername() {
		txtUsername.sendKeys(readConfig.getUsername());
	}
	
	public void txtPassword() {
		 txtPassword.sendKeys(readConfig.getPassword());
	}
	
	public void btnLogin() {
		btnLogin.click();
	}
	
}
