package testCases;



import java.io.IOException;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.XLUtility;


public class Login_TestDDT {
	WebDriver driver;
	
	Logger logger=Logger.getLogger("LoginDDt");

	@Test(dataProvider="Logindata")
	public void loginTestDDT(String user, String Pwd,String exp) throws InterruptedException
	
	{
		
	}
	@DataProvider(name="Logindata")
	public String [][]getData() throws IOException 
	{		String path="/Users/apple/eclipse-workspace/POM Project/FacebookTest/src/test/java/testData/LoginData.xlsx";
			XLUtility xlutil=new XLUtility(path);
	
			int totalrows=xlutil.getRowCount("LoginData");
			int totalcols=xlutil.getCellCount("LoginData",1);	
			
			String loginData[][]=new String[totalrows][totalcols];
		
	
	for(int i=1;i<=totalrows;i++) //1
	{
		for(int j=0;j<totalcols;j++) //0
		{
			loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
		}
			
	}
	
	return loginData;
		}
		
		
	}

	