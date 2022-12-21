package com.Utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerTest implements ITestListener{
		
		
		ExtentSparkReporter htmlReporter;
		ExtentReports reports;
		ExtentTest test ;
		@BeforeClass
		public void onStart(ITestContext testContext)
		
		{
			htmlReporter=new ExtentSparkReporter("/Users/apple/eclipse-workspace/POM Project/FacebookTest/target/SparkReport.html");
			
			reports=new ExtentReports();
			reports.attachReporter(htmlReporter);
			reports.setSystemInfo("Machine", "MacBook Air");
			reports.setSystemInfo("OS", "Macbook");
			reports.setSystemInfo("TesterName", "sampat");
			reports.setSystemInfo("Browser", "Chrome");
			
			
			htmlReporter.config().setDocumentTitle("Automation test Report");
			
			htmlReporter.config().setReportName("InventoryTest Report");
			
			htmlReporter.config().setTheme(Theme.DARK);
			System.out.println("The System starts opening Browser ");
			
			
		
		}
		
		
		public void onTestStart(ITestResult Result)
		{
			
		}
		public void onTestSkipped(ITestResult Result)
		{
			System.out.println("The Skipped test is:"+Result.getName());
			
			test=reports.createTest(Result.getName());
			test.log(Status.SKIP, MarkupHelper.createLabel("The Skipped Test is:"+Result.getName(), ExtentColor.YELLOW));
			
			
			
		}
		public void onTestFailure(ITestResult Result)
		{
			System.out.println("The Failed test is :"+Result.getName());
			test=reports.createTest(Result.getTestName());
			test.log(Status.FAIL, MarkupHelper.createLabel("The Failed Tet case is:"+Result.getName(),ExtentColor.RED));
			String ScreenshotPath=System.getProperty("/Users/apple/eclipse-workspace/POM Project/FacebookTest/ScreenShots"
			+Result.getName()+".png");
			
			File file=new File(ScreenshotPath);
			
			if(file.exists())
			{
				try
				{
					test.fail("SceenShot is Below:"+test.addScreenCaptureFromPath(ScreenshotPath));
					
				}
				catch(Exception e)
				{
					System.out.println("The Occured exception is:"+e.getMessage());
					
				}
			}
			
			
		}
		public void onTestSuccess(ITestResult Result)
		{
			System.out.println("The passed test is :"+Result.getName());
			test=reports.createTest(Result.getName());
			test.log(Status.PASS, MarkupHelper.createLabel("The Passed Test is:"+Result.getName(), ExtentColor.GREEN));
			
			
		
		}
		@AfterClass
		public void onFinish(ITestContext testContest)
		{
			reports.flush();
			System.out.println("The Testing has been Finished");
			
	}


		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
	


}
