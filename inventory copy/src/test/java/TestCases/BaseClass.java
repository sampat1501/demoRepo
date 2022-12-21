package TestCases;



import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	
	public static String Password="EpybEgy";
	public static WebDriver driver;
	public String BaseUrl ="https://demo.guru99.com/";
	Logger logger;
	
	
	@BeforeClass
	public void setpmethod()
	{
		Logger logger=Logger.getLogger(BaseClass.class);

		PropertyConfigurator.configure("/Users/apple/eclipse-workspace/POM Project/FacebookTest/log4j.properties");
		System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/Inventory-V5/Drivers/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get(BaseUrl);
		logger.info("Opned Url");
		
		
	}
	@AfterClass
	public void tearDownMethod()
	{
		driver.quit();
		logger.info("Page Closed");
	}
	

}
