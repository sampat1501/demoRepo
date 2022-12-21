package PageObjects;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginWithPageFacotryPOM {
	
	
	WebDriver driver;
	
	public loginWithPageFacotryPOM(WebDriver d)
	{
		driver=d;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") @CacheLookup WebElement Username;
	
	//@FindBy(id="pass")@CacheLookup WebElement Password;
	
	@FindBy(id="loginbutton")@CacheLookup WebElement btn;
	
	@FindBy(xpath="//a[contains(text(),'Sign up for Facebook')]") WebElement SignUpbtn;
	
	@FindBy(name="firstname") WebElement Fname;
	
	@FindBy(name="lastname")WebElement Lname;
	
	@FindBy(name="reg_email__")WebElement emailID;
	
	@FindBy(name="reg_passwd__") WebElement Pass;
	
	@FindBy(name="birthday_day") WebElement DOB;
	
	@FindBy(name="birthday_month") WebElement birthMonth;
	
	@FindBy(name="birthday_year") WebElement Year;
	
	@FindBy(xpath="//label[contains(text(),'Male')]") WebElement Sex;
	
	@FindBy(name="websubmit") WebElement submitbtn;
	
	
	@FindBy(name="uid") WebElement UserID;
	@FindBy(name="password") WebElement Password;
	@FindBy(name="btnLogin")WebElement Login;
	@FindBy(xpath="//a[contains(text(),'Log out')]") WebElement logOut;
	
	
	public void enterUsername(String unm)
	{
		Username.sendKeys(unm);
	}
	
	public void enterPassword(String Pass)
	{
		
		Password.sendKeys(Pass);
	}
	
	public void clickBtn()
	{
		btn.click();
	}
	
	public void clickSignUp()
	{
		SignUpbtn.click();
	}
	
	public void enterfirstName(String fnm)
	{
		Fname.sendKeys(fnm);
	}
	
	public void EnterLastName(String Lnm)
	{
		Lname.sendKeys(Lnm);
	}
	public void enterEmail(String EmailID)
	{
		emailID.sendKeys(EmailID);
	}	
	public void enterPasskey(String PassKey)
	{
		Pass.sendKeys(PassKey);
	}
	public void submitBtn()
	{
		submitbtn.click();
	}
	
	public void UserID(String uid) {
		
		UserID.sendKeys(uid);
	}
	public void gpass(String gPwd) {
		
		Password.sendKeys(gPwd);
	}
	
	public void glogin() {
		
		Login.click();
	}
	public void LogOut()
	{
		logOut.click();
	}

}


