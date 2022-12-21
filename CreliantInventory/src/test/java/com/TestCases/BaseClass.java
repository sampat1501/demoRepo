package com.TestCases;
import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.PageObjects.purchaseManagement;
import com.Utilities.readConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	purchaseManagement Pm ;
	readConfig readConfiguration=new readConfig();

	public String baseUrl=readConfiguration.getApplicationURL();
	
	public String Username=readConfiguration.getUsername();
	
	public String PassWord=readConfiguration.getPassword();
	
	public WebDriver driver;
	
	public  String supplierName ;
	
	Logger logger;
	@BeforeClass
	public void setupMethod() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();		
		driver=new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Pm= new purchaseManagement(driver);
		
		
		logger=Logger.getLogger("CrelioHealthInventoryLogs");
		
		PropertyConfigurator.configure("log4j.properties");
	
		logger.info("opened the Browser");
		Pm.usernameEntry("Saturn-Dummy2");
		logger.info("Username  Entered.....");

		Pm.passwordEntry("Dummy@1234");
		logger.info("Password Entered.....");

		Pm.securesignin();
		logger.info("securesignin.....");
		
		

		
		
	}
	@AfterClass
	public void tearDownMethod()
	{
		driver.quit();
		logger.info("Browser Closed........!!!1");
	
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException  {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public  String randomestring()
	{
		int length = 10;
	    boolean useLetters = true;
	    boolean useNumbers = true;
	    String supplierName = RandomStringUtils.random(length, useLetters, useNumbers); 
		return supplierName;
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
	

}
