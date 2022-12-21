package com.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class purchaseManagement {
	
	WebDriver driver;
	public purchaseManagement(WebDriver d)
	{
		driver=d;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='username']") WebElement Username ;
	@FindBy(xpath="//input[@id='password']") WebElement Password;
	@FindBy(xpath="//body/div[2]/div[1]/ul[1]/div[1]/form[1]/input[2]") WebElement SignInButton ;
	@FindBy(xpath="//span[contains(text(),'Purchase Management')]") WebElement PurchaseManagement;
	@FindBy(xpath="//a[contains(text(),'Place Vendor Order')]") WebElement PlaceVendorOrder;
	@FindBy(xpath="//a[contains(text(),'Order By Supplier')]") WebElement orderBysupplier;
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/"
			+ "div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]") 
	WebElement ClearSearchBox;
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/"
			+ "div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/"
			+ "div[1]/div[2]/div[1]/*[1]") 
	WebElement SearchSupplier;
	
	@FindBy(xpath="//input[@id='67666']")WebElement Inventoryinputbox;
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/span[1]/div[1]/button[1]")
	WebElement addtoCart;
	@FindBy(xpath="//button[@id='cart-order-btn']") WebElement cart;
	@FindBy(xpath="//button[@id='cart-next-button']") WebElement cartnextbutton;
	@FindBy(xpath="//button[@id='place-order']") WebElement PlaceOrder;
	@FindBy(xpath="//button[@id='add-place-btn']") WebElement YesBtn;
	@FindBy(xpath="//button[@id='order-close-btn']")WebElement NoButton;
	@FindBy(xpath="//input[@id='cc-email-input']") WebElement ccMailinputbox;
	@FindBy(xpath="//textarea[@id='message-input']") WebElement messageInputBox;
	@FindBy(xpath="//input[@id='lab-name-search']")WebElement SearchInventory;
	@FindBy(xpath="//a[contains(text(),'Order By Product')]")  WebElement OrderByProduct;
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]"
			+ "/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/"
			+ "div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/"
			+ "div[1]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement SelectInventoryDropdown;
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/"
			+ "div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/"
			+ "div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]"
			+ "/span[1]/input[1]")
	WebElement QtyInputBox;
	@FindBy(xpath="//div[@class='ag-header-container'] //div[@role='columnheader']") List<WebElement>OrderbyProductColumnheaders;
	
	public String OrderbyProductColumnheaders()
	{
		String eleText = null;
		for(WebElement ele:OrderbyProductColumnheaders)
		{
			eleText=ele.getText();
			if (eleText.equalsIgnoreCase("Supplier"))
			{
				System.out.println(eleText);
				break;
			}
		}
		return eleText;
	}
	
	public void usernameEntry(String usernm)
	{
		Username.sendKeys(usernm);
	}
	public void passwordEntry(String pswd)
	{
		Password.sendKeys(pswd);
	}
	public void securesignin()
	{
		SignInButton.click();
	}
	public void purchaseManagementHeader()
	{
		PurchaseManagement.click();
	}
	public void placeVendorOrder()
	{
		PlaceVendorOrder.click();
	}
	public void orderBySUpplierHeader()
	{
		orderBysupplier.click();
	}
	public void clearSerchBox()
	{
		ClearSearchBox.click();
	}
	public void searchSupplierInputBox(String supName)
	
	{
		SearchSupplier.sendKeys(supName);
		Select select =new Select(SearchSupplier);
		select.selectByIndex(1);
	}
	public void enterQty(String qty)

	{
		Inventoryinputbox.sendKeys(qty);
	}
	public void addtocartBtn() 
	{
		addtoCart.click();
	}
	public void clickonCart()
	{
		cart.click();
	}
	public void cartNextBtn()
	{
		cartnextbutton.click();
	}
	public void placeOrderBtn()
	{
		PlaceOrder.click();
	}
	public void yesBtnClick()
	{
		YesBtn.click();
	}
	public void noBtnClick()
	{
		NoButton.click();
	}
	public void ccMailEnter(String mailID) {
		ccMailinputbox.sendKeys(mailID);
	}
	public void EnterMessage(String Message)
	{
		messageInputBox.sendKeys(Message);
	}
	public void searchSupplierClick()
	{
		SearchSupplier.click();
	}
	public void SearchInventory(String Inventory)
	{
		SearchInventory.sendKeys(Inventory);
	}
	public void searchsupplierbyName(String supplierName)
	{
		SearchSupplier.sendKeys(supplierName);
	}
	public void OrderByProduct()
	{
		OrderByProduct.click();
	}
	public void SelectInventoryDropdown() throws InterruptedException
	{
		SelectInventoryDropdown.click();
		Thread.sleep(2000);
		Select select=new Select(SelectInventoryDropdown);
		select.selectByVisibleText("Brand:N.A");
	}
	public void QtyInputBox(String qty) throws InterruptedException
	{
		QtyInputBox.clear();
		Thread.sleep(2000);
		QtyInputBox.sendKeys(qty);
		
	}
	

}
