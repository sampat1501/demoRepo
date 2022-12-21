package com.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.PageObjects.purchaseManagement;

import freemarker.log.Logger;

public class PurchaseManagementTestCases extends BaseClass{
	

	purchaseManagement Pm;
	@Test
	public void placeOrderTestCase() throws InterruptedException
	{
		
		Pm=new purchaseManagement(driver);
		
	
		Pm.purchaseManagementHeader();
		logger.info("Clicked on Purchase Management Header.........!!!!");
		Thread.sleep(5000);
		Pm.placeVendorOrder();
		logger.info("Clicked on Place vendor order");
		Pm.orderBySUpplierHeader();
		logger.info("Clicked on order by Supplier header");
		Thread.sleep(2000);
		Pm.clearSerchBox();
		logger.info("Search box has been cleared");
		Pm.searchSupplierClick();
		logger.info("Clicked on Input Box.......");
		Thread.sleep(2000);
		Pm.searchsupplierbyName("sampat");
		logger.info("Supplier name entered ABC......");
		Thread.sleep(2000);
		Pm.enterQty("12.30");
		logger.info("Qty Entered");
		Pm.addtocartBtn();
		logger.info("Cliceked on Add to Cart");
		Thread.sleep(2000);
		Pm.clickonCart();
		logger.info("Clicked on Cart.......");
		
		Pm.cartNextBtn();
		Pm.placeOrderBtn();
		Pm.ccMailEnter("sampatbansode@gmail.com");
		Pm.EnterMessage("This is my first automated order");
		Pm.yesBtnClick();
		
		
	}
	@Test
	public void SearchInventoryTestCase() throws InterruptedException
	{
		Pm=new purchaseManagement(driver);
		
		
		Pm.purchaseManagementHeader();
		logger.info("Click on Purchase management Header");
		Pm.placeVendorOrder();
		logger.info("CLicked on Place vendor Order");
		Pm.SearchInventory("Vitamin B12");
		Thread.sleep(5000);
		logger.info("Entered inventory name as Vitamin B12");
	}
	@Test
	public void orderbySupplierTest()
	{
		Pm=new purchaseManagement(driver);
		
		Pm.purchaseManagementHeader();
		logger.info("Click on Purchase management Header");
		Pm.placeVendorOrder();
		logger.info("CLicked on Place vendor Order");
		Pm.OrderByProduct();
		logger.info("Clikced on Order by Product");
		Pm.SearchInventory("Dummy Bala");
		Pm.SearchInventory(PassWord);
		
	}

}
