package com.PageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageObjects{
	
	
	@FindBy (name="username")@CacheLookup WebElement Username;
	
	@FindBy(name="password")WebElement Password;
	
	@FindBy(xpath="//body/div[2]/div[1]/ul[1]/div[1]/form[1]/input[2]")WebElement SignInUsingOurSecureServer;

	private WebDriver driver;

	public LoginPageObjects(WebDriver d)
	{
		this.driver=d;
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String unm)
	{
		Username.sendKeys(unm);
		
	}
	public void enterPassword(String Pwd)
	{
		Password.sendKeys(Pwd);
	}
	public void clickLogin()
	{
		SignInUsingOurSecureServer.click();
	}
	
	
	
}
