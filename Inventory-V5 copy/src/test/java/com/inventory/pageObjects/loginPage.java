package com.inventory.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	
	public loginPage(WebDriver d){
		
		driver=d;
		
		
	}
	
	@FindBy(xpath=("//input[@id='email']"))
	WebElement email;
	

	@FindBy(xpath=("//input[@id='pass']"))
	WebElement Pass;
	

	@FindBy(xpath=("//button[@id='loginbutton']"))
	WebElement loginbtn;
	
	public void enterEmail(String eml)
	{
		email.sendKeys(eml);
		
	}
	public void enterPasskey(String pwd)
	{
		Pass.sendKeys(pwd);
		
		
	}
	public void clickLogin()
	{
		loginbtn.click();
		
		
	}
}
	
