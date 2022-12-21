package testCases;


import org.testng.annotations.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import PageObjects.LoginPageInventoryV5;

public class loginPage {
	
	WebDriver driver;
	Logger logger=Logger.getLogger("FaceBookTest");
	
	@BeforeMethod
	public void setUpMethod()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/Inventory-V5/Drivers/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("https://uat.crelio.solutions/inventory-v5/");
		driver.manage().window().fullscreen();
		
		
		PropertyConfigurator.configure("log4j.properties");
		
		
	}
	@AfterMethod
	public void tearDownMethod()
	{
		
		driver.quit();
	}
	@Test
	public void LoginTest()
	{
		LoginPageInventoryV5 loginPage=new LoginPageInventoryV5(driver);
		loginPage.EnterUsername("dl-mohit");
		loginPage.EnterPassword("Password@123");
		loginPage.clickRegistration();

		
		
	
	}
	@Test
	public void method1()
	{
	System.out.println("this method is method 1");

	}

	@Test
	public void method2()
	{
	System.out.println("this method is method 2");
	Assert.assertTrue(true);

	}

	@Test
	public void method3()
	{
	
	Assert.assertTrue(false);
	System.out.println("this method is method 3");

	}

	@Test
	public void method4()
	{
	System.out.println("this method is method 4");
	Assert.assertTrue(false);

	}

	@Test
	public void method5()
	{
	System.out.println("this method is method 5");

	}

}
