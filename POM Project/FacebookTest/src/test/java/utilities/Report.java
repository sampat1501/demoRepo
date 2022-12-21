package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report
{
	public WebDriver driver;
	
	ExtentReports reports = new ExtentReports();
	
	ExtentSparkReporter htmlreporter = new ExtentSparkReporter("target/Spark.html");
	
	ExtentTest test;
	
	
	
	
	@BeforeTest
	public void setreport() {
		
		

	}
	@AfterTest
	public void flushreport() 
	{
		
		driver.quit();
	}
}

