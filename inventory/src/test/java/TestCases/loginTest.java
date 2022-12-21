package TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.invetoryAdmin.loginPage;

public class loginTest extends BaseClass{
	
	WebDriver driver;
	
	Logger log;
	
	loginPage lp=new loginPage(driver);
	
	@Test
	public void loginTestcase() {
		
		lp.setUsername(BaseUrl);
		lp.setPassword(Password);
		lp.ClickLogin();
		
		
	}
	
	

}
