package com.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjects.LoginPageObjects;

public class LoginPageTest extends BaseClass{
	
	
	@Test
	public void UserLoginTestCase()
	{
		LoginPageObjects lp= new LoginPageObjects(driver);

		lp.enterUserName(Username);
		logger.info("Username Entered......>>>>!!!!");
		lp.enterPassword(PassWord);
		logger.info("Password Entered......>>>>!!!!");

		lp.clickLogin();
		
		logger.info("Clicked on Login Button........!!!!!!");
	}
	@Test
	public void testMethod1()
	{
		AssertJUnit.assertTrue(false);
	}
}
