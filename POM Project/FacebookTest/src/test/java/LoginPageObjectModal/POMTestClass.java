package LoginPageObjectModal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMTestClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/Inventory-V5/Drivers/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		
		
		
		POMWithoutPageFactory loginPg=new POMWithoutPageFactory(driver);
		
		loginPg.enterUsername("sampatbansode19@gmail.com");
		
		loginPg.enterPassword("Password@123");
		
		loginPg.clickBtn();

	}

}