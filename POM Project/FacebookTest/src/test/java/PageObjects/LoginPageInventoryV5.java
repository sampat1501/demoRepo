package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageInventoryV5 {
	
	WebDriver driver;
	
	public LoginPageInventoryV5(WebDriver d)
	{
		driver=d;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='username']")WebElement Username;
	
	@FindBy(xpath="//input[@id='password']")WebElement Password;
	
	@FindBy(xpath="//body/div[2]/div[1]/ul[1]/div[1]/form[1]/input[2]")WebElement submit;
	
	@FindBy(xpath ="//header/div[1]/ul[1]/li[2]")
	WebElement Registration;
	
	@FindBy(xpath="//a[contains(text(),'Inventory')]") WebElement Inventory;
	
	@FindBy(xpath="//a[@id='navlink-parent-0']") WebElement ModuleStockManagement;
	
	@FindBy(xpath="//a[contains(text(),'Adjust Stock Manually')]") WebElement AdjustStockManually;
	
	@FindBy(xpath="//button[@id='direct-stock-entry-btn']") WebElement btnDirectStockEntry;
	public void EnterUsername(String Unm)
	{
		Username.sendKeys(Unm);
	}
	
	public void EnterPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void Submit()
	{
		submit.click();
	}
	
	public void clickRegistration()
	
	{
		Actions action = new Actions(driver);
		action.moveToElement(Registration).perform();
		Registration.click();
	}
	
	public void ClickInventory()
	{
		Inventory.click();
	}
	public void clickOnStockManagement()
	{
		ModuleStockManagement.click();
	}
	public void DirectStockEntry()
	{
		btnDirectStockEntry.click();
	}
	
	
}
