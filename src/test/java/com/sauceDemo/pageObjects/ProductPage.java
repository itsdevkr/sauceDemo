package com.sauceDemo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
	
	@FindBy(xpath="//div[@class='product_label']")
	@CacheLookup
	private WebElement lblProduct;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	@CacheLookup
	private WebElement containerProductSort;
	
	@FindBy(xpath="//select[@class='product_sort_container']/option[3]")
	@CacheLookup
	private WebElement sortByLowToHigh;
	
	public WebElement lblProduct() {
		return lblProduct;
	}
	
	public WebElement containerProductSort() {
		return containerProductSort;
	}
	
	public WebElement sortByLowToHigh() {
		return sortByLowToHigh;
	}

}
