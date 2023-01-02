package com.TestCases;

import org.testng.annotations.Test;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import com.PageObjects.inventoryMasterListPageObjects;

public class InventoryMasterlistTestCases extends BaseClass {
	
	inventoryMasterListPageObjects impl;
	@Test
	public void AddInventroyTestCase() throws InterruptedException
	{
		impl=new inventoryMasterListPageObjects(driver);
		impl.AdminClick();
		logger.info("Cliked on Admin G=Header;.....");
		impl.InventoryMasterList();
		logger.info("Clicked on Inventory master list....");
		impl.addnewproductbtn();
		logger.info("Clicked on addnewproductbtn....");
		int length = 10;
	    boolean useLetters = true;
	    boolean useNumbers = true;
	    String inventoryName = RandomStringUtils.random(length, useLetters, useNumbers);
	    logger.info("Random Inventory name has been generated....");
	    System.out.println(inventoryName);
		impl.EnterInventoryName(inventoryName);
		logger.info("Inventory name entered");
		Thread.sleep(2000);
		/*impl.Category();
		logger.info("Clicked on category");
		Thread.sleep(2000);
		impl.SelectCategory();
		logger.info("Category selected" );
		impl.departmentClick();
		logger.info("Clicked on Department");
		impl.Deaprtment();
		logger.info("Department selected");*/
		impl.SubType("Solid");
		logger.info("entered subtype as Solid");
		impl.ConsumptionUnit("ml");
		logger.info("Consumption Unit....As Ml");
		impl.PurchaseUnit("Litre");
		logger.info("PurchaseUnit....As Litre");
		Thread.sleep(3000);
		impl.AutoGenerateMaterialCodeCheckBox();
		logger.info("Clicked on AutoGenerateMaterialCodeCheckBox");
		Thread.sleep(3000);
		impl.UnitQuantity("100");
		logger.info("Enter Unit Qty as 100");
		impl.alertLevel("5");
		logger.info("Alert Level 5");
		impl.GST_Tax("12.50");
		logger.info("Tax Entered as 12,5");
		Thread.sleep(3000);
		impl.SaveButton();
		Thread.sleep(3000);
		impl.SearchInventorybyName(inventoryName);
		Thread.sleep(2000);
	}

}
