package com.inventory.testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.inventory.pageObjects.loginPage;
public class LoginPage_TC_001  {
	
	
	WebDriver driver;
	public void setupMethod()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/Inventory-V5/Drivers/chromedriver");
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
	}
	@Test
	
	public void loginPageTest()
	{
	
	loginPage loginpg=new loginPage(driver);
	
	loginpg.enterEmail("sampatbansode19");
	
	loginpg.enterPasskey("Password@123");
	
	loginpg.clickLogin();
	
	}
}
