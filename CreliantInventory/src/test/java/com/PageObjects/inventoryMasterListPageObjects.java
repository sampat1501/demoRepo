package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class inventoryMasterListPageObjects {
	
	WebDriver driver;

	public inventoryMasterListPageObjects(WebDriver d) {
		driver=d;
		
		PageFactory.initElements(driver ,this);
	}
	@FindBy(xpath="//a[@id='navlink-parent-8']") WebElement AdminCLick;
	@FindBy(xpath="//a[contains(text(),'Inventory Add/Edit')]") WebElement InventoryMasterList ;
	@FindBy(xpath="//button[@id='add-new-product-btn']") WebElement addnewproductbtn;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]") WebElement EnterInventoryName;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]") WebElement category ;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]") WebElement Deaprtment ;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[8]/input[1]") WebElement SubType ;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[10]/input[1]") WebElement ConsumptionUnit;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[12]/input[1]") WebElement PurchaseUnit;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[14]/input[1]") WebElement MatreialCode;
	@FindBy(xpath="//input[@id='update-source-checkbox']") WebElement AutoGenerateMaterialCodeCheckBox;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[16]/input[1]") WebElement UnitQuantity ;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[18]/input[1]") WebElement alertLevel ;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[20]/input[1]") WebElement GST_Tax;
	@FindBy(xpath="//button[@id='add-product-btn']") WebElement SaveButton ;
	@FindBy(xpath="//button[@id='cancel']") WebElement CancelButton;
	@FindBy(xpath="//input[@id='lab-name-search']") WebElement SearchInventorybyName;
	public void AdminClick()
	{
		AdminCLick.click();
	}
	public void InventoryMasterList()
	{
		InventoryMasterList.click();
	}
	public void addnewproductbtn()
	{
		addnewproductbtn.click();
	}
	public void EnterInventoryName(String InventoryName)
	{
		EnterInventoryName.sendKeys(InventoryName);
	}
	public void Category()
	{
		category.click();
	}
	public void SelectCategory()
	{
		Select select=new Select(category);
		select.selectByIndex(0);
		
	}
	public void departmentClick()
	{
		Deaprtment.click();
	}
	public void Deaprtment()
	{
		Select select=new Select(Deaprtment);
		select.selectByIndex(0);
		
	}
	public void SubType(String subType)
	{
		SubType.sendKeys(subType);
	}
	public void ConsumptionUnit(String consumption)
	{
		ConsumptionUnit.sendKeys(consumption);
	}
	public void PurchaseUnit(String purchase)
	{
		PurchaseUnit.sendKeys(purchase);
	}
	public void MatreialCode(String mCode)
	{
		MatreialCode.sendKeys(mCode);
	}
	public void AutoGenerateMaterialCodeCheckBox()
	{
		AutoGenerateMaterialCodeCheckBox.click();
	}
	public void UnitQuantity(String  unitQty)
	{
		
		UnitQuantity.sendKeys(unitQty);
	}
	public void alertLevel(String alertLe)
	{
		alertLevel.sendKeys(alertLe);
	}
	public void GST_Tax(String tax)
	{
		GST_Tax.sendKeys(tax);
	}
	public void SaveButton()
	{
		SaveButton.click();
	}
	public void CancelButton()
	{
		CancelButton.click();
	}
	public void SearchInventorybyName(String Inventory)
	{
		SearchInventorybyName.sendKeys(Inventory);
	}
}
