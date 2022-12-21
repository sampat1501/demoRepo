package com.invetoryAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver ldriver;
	
	
	
	public loginPage (WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
		
		
	}
	@FindBy(name ="Username")
	WebElement User;
	@FindBy(name ="Password")
	WebElement Password;
	@FindBy(name ="login")
	WebElement login;
	
	public void setUsername(String usm) {
		User.sendKeys(usm);
	}
	
	public void setPassword(String Pass)
	{
		Password.sendKeys(Pass);
	}
	
	public void ClickLogin()
	{
		login.click();
	}
	
}

