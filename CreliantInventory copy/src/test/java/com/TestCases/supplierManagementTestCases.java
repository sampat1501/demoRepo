package com.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.api.robot.Key;
import org.testng.annotations.Test;

import com.PageObjects.purchaseManagement;
import com.PageObjects.supplierManagement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class supplierManagementTestCases extends BaseClass {
	
	purchaseManagement Pm;
	supplierManagement sm;
	BaseClass b= new BaseClass();
	
	
	
	
	@Test
	public void AddNewSupplierTestCase() throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();		
		driver=new ChromeDriver();
		
		driver.get("https://uat.crelio.solutions/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		String Suppliername=b.randomestring();
		System.out.println(Suppliername);
		

		sm=new	supplierManagement(driver);
		sm.SupplierMasterlistClick();
		logger.info("SupplierMasterlistClick Cliked");
		Thread.sleep(2000);
		sm.AddNewSupplierClick();
		logger.info("AddNewSupplierClick Cliked");
		
	    logger.info("Random Inventory name has been generated....");
		sm.SupplierName(Suppliername);
		logger.info("Supplier name Entered ...");
		Thread.sleep(2000);
		sm.EnterMobileNumber("7724242424");
		logger.info("Mobile number  Entered ...");

		sm.EmailID("sampat.bansode@livehealth.in");
		logger.info("Email Entered ...");

		sm.ContactPersonName("Atharva");
		logger.info("ContactPersonName  Entered ...");

		sm.ContactPersonMobileNumber("9376767676");
		logger.info("ContactPersonMobileNumber  Entered ...");

		sm.ContactPersonEmailId("Email1234@gmail.com");
		logger.info("ContactPersonEmailId  Entered ...");

		sm.City("Pune");
		logger.info("City Entered ...Pune");

		sm.Address("Pune");
		logger.info("Address Entered ...Pune");
		sm.AccountNo("1234353554");
		logger.info("Account nuber Entered ...1234353554");
		sm.TaxRegistrationNumber("Basbas253d");
		logger.info("TaxRegistrationNumber ...Basbas253d");
		sm.PanNumber("AUUsg629tr");
		logger.info("PanNumber ...AUUsg629tr");
		sm.IFSC_Code("CBIN0284444");
		logger.info("IFSC_Code ...CBIN0284444");
		sm.CreditLimit("5000");
		logger.info("CreditLimit ...5000");
		sm.CreditPeriod("30");
		logger.info("CreditPeriod ...30");
		sm.Description("Okay HAy");
		logger.info("Description ...Okay HAy");
		sm.Remark("Sampat's Sanity suit Preparation");
		logger.info("Remark ...Sampat's Sanity suit Preparation");
		Thread.sleep(5000);
		sm.Addbtn();
		logger.info("Cliked on Add Suppler and Supplier added");
		Thread.sleep(5000);
		sm.searchBySUpplierName(Suppliername);
		logger.info("Search Supplier....");
		sm.DetailsButton();
		logger.info("Clicked on details button...");
		sm.ProductMappingHeader();
		logger.info("Clicked on ProductMappingHeader ...");
		sm.ProductMappingButton();
		logger.info("Clicked on ProductMappingButton ...");
		Thread.sleep(2000);
		sm.ProductsDropdown();
		logger.info("Clicked on ProductsDropdown ...");
		Thread.sleep(2000);
		//sm.ProductsDropdownEnterInventory(Key.ENTER);
		sm.DropdownSelectionSymbol();
		logger.info("ProductsDropdownEnterInventory Entered...");
		Thread.sleep(2000);
		sm.DropdownSelectionSymbolEnterKey(Keys.ENTER);

	}
	@Test

	public void searchSupplierTest() throws InterruptedException
	{
		Pm=new purchaseManagement(driver);
		sm=new	supplierManagement(driver);
		Pm.usernameEntry("Saturn-Dummy2");
		Thread.sleep(2000);
		Pm.passwordEntry("Dummy@1234");
		Thread.sleep(2000);
		Pm.securesignin();
		Thread.sleep(2000);
		sm.SupplierMasterlistClick();
		logger.info("SupplierMasterlistClick Cliked");
		Thread.sleep(2000);
		
		sm.searchBySUpplierName("sampat987654");
		Thread.sleep(3000);
		logger.info("Searching Supplier..successfully");
		sm.SupplierDetailsClick();
		logger.info("SupplierDetailsClick..");

		Thread.sleep(2000);
		sm.UpdateSupplierButton();
		logger.info("UpdateSupplierButton..");

		Thread.sleep(5000);
		
	}

}
