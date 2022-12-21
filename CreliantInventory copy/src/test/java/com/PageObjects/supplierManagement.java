package com.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.api.robot.Key;

public class supplierManagement {
	
	WebDriver driver;
	public supplierManagement (WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='navlink-parent-4']") WebElement SupplierMasterList;
	@FindBy(xpath="//button[@id='add-new-supplier-btn']") WebElement AddNewSupplier;
	@FindBy(xpath="//input[@id='supplier-name']") WebElement SupplierName;
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/input[1]") WebElement EnterMobileNumber;
	@FindBy(id="email-id") WebElement EmailID;
	@FindBy(xpath="//input[@id='contact-person-name']") WebElement ContactPersonName;
	@FindBy(xpath="//input[@id='contact-person-name']") WebElement ContactPersonMobileNumber;
	@FindBy(id="contact-person-email-id") WebElement ContactPersonEmailId;
	@FindBy(xpath="//input[@id='city']") WebElement City;
	@FindBy(id="address") WebElement Address;
	@FindBy(xpath="//button[@id='request-edit']") WebElement Addbtn;
	@FindBy(xpath="//input[@id='account-no']") WebElement AccountNo;
	@FindBy(xpath="//input[@id='tax-reg-no']") WebElement TaxRegistrationNumber;
	@FindBy(xpath="//input[@id='pan-number']") WebElement PanNumber;
	@FindBy(xpath="//input[@id='ifsc-code']") WebElement IFSC_Code;
	@FindBy(id="credit-limit") WebElement CreditLimit;
	@FindBy(id="credit-priod") WebElement CreditPeriod;
	@FindBy(id="description") WebElement Description;
	@FindBy(id="remark") WebElement Remark;
	@FindBy(xpath="//input[@id='search-by-supplier-input']") WebElement SearchBySupplierName;
	@FindBy(xpath="//button[@id='add-stock-btn']") WebElement SupplierDetails;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/"
			+ "div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]/button[1]") 
	WebElement EditSupplierBtn;
	@FindBy(xpath="//button[@id='request-edit']")WebElement UpdateSupplierButton;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/"
			+ "div[1]/div[1]/div[1]/div[1]/div[1]/"
			+ "div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[5]/"
			+ "div[1]/span[1]/button[1]")
	WebElement DetailsButton;
	@FindBy(xpath="//a[contains(text(),'Product List')]")WebElement ProductMappingHeader;
	@FindBy(xpath="//button[@id='add-new-supplier-btn']")WebElement ProductMappingButton;
	@FindBy(xpath="//div[contains(text(),'Products')]") WebElement ProductsDropdown;
	@FindBy(xpath="//div[@class=' css-1uccc91-singleValue']") WebElement ProductsDropdownEnterInventory;
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/*[1]")
	WebElement DropdownSelectionSymbol;

	public void DropdownSelectionSymbol()
	{
		DropdownSelectionSymbol.click();
		
	}
	public void DropdownSelectionSymbolEnterKey(Keys enter)
	{
		DropdownSelectionSymbol.sendKeys(enter);
		
	}
	
	
	public void SupplierMasterlistClick()
	{
		SupplierMasterList.click();
	}
	public void AddNewSupplierClick()
	{
		AddNewSupplier.click();
	}
	public void EnterMobileNumber(String MobileNumber)
	{
		EnterMobileNumber.sendKeys(MobileNumber);
	}
	public void EmailID(String Email)
	{
		EmailID.sendKeys(Email);
	}
	public void SupplierName(String SupName)
	{
		SupplierName.sendKeys(SupName);
	}
	public void ContactPersonName(String ConatctPerson)
	{
		ContactPersonName.sendKeys(ConatctPerson);
	}
	public void ContactPersonMobileNumber(String ContactPMobile)
	{
		ContactPersonMobileNumber.sendKeys(ContactPMobile);
	}
	public void ContactPersonEmailId(String Cemail)
	{
		ContactPersonEmailId.sendKeys(Cemail);
	}
	public void City(String CityName)

	{
		City.sendKeys(CityName);
	}
	public void Addbtn()

	{
		Addbtn.click();
	}
	public void Address(String Addre)
	{
		Address.sendKeys(Addre);
	}
	public void AccountNo(String Acc)
	{
		AccountNo.sendKeys(Acc);
	}
	public void TaxRegistrationNumber(String TRN)
	{
		TaxRegistrationNumber.sendKeys(TRN);
	}
	public void IFSC_Code(String Ifsc)
	{
		IFSC_Code.sendKeys(Ifsc);
	}
	public void PanNumber(String Pan)
	{
		PanNumber.sendKeys(Pan);
	}
	public void CreditLimit(String CrLimit)
	
	{
		CreditLimit.sendKeys(CrLimit);
	}
	public void CreditPeriod(String CrPeriod)
	{
		CreditPeriod.sendKeys(CrPeriod);
	}
	public void Description(String Descri)
	{
		Description.sendKeys(Descri);
	}
	public void Remark(String Remar)
	{
		Remark.sendKeys(Remar);
	}
	public void searchBySUpplierName(String SupSearch)
	{
		SearchBySupplierName.sendKeys(SupSearch);
	}
	public void SupplierDetailsClick()
	{
		SupplierDetails.click();
	}
	public void EditSupplierBtn()
	{
		SupplierDetails.click();
	}
	public void UpdateSupplierButton()
	{
		UpdateSupplierButton.click();
	}
	public void DetailsButton()
	{
		DetailsButton.click();
	}
	public void ProductMappingHeader()
	{
		ProductMappingHeader.click();
	}
	public void ProductMappingButton()
	{
		ProductMappingButton.click();
	}
	public void ProductsDropdown() 
	{
		ProductsDropdown.click();
	}
		
	public void ProductsDropdownEnterInventory(String InvenName)
	{
		ProductsDropdownEnterInventory.sendKeys(InvenName);
	}

}

