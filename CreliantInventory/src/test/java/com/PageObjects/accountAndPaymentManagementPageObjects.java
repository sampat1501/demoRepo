package com.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountAndPaymentManagementPageObjects {
	
	WebDriver driver;
	

	public accountAndPaymentManagementPageObjects(WebDriver d) 
	{
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[contains(text(),'Supplier Management')]")WebElement SupplierManagementHeader ;
	@FindBy(xpath="//a[contains(text(),'Account and Payment')]")WebElement AccountandPayment;
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/li[1]/a[1]")WebElement Account;
	@FindBy(xpath="//input[@id='account-name-search']")WebElement AccountNameSearch;
	@FindBy(xpath="//div[@class='ag-header-container'] //div[@role='columnheader']")List<WebElement> ColumnHeaders ;
	@FindBy(xpath="//div[@col-id='supplierName'] ") List<WebElement> SupplierNames ;
	
}
