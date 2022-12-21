package LoginPageObjectModal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPageWithoutPOM {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/Inventory-V5/Drivers/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		// find element and enter data
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sampatbansode19@gmail.com");
		
		
		WebElement Pass=driver.findElement(By.id("pass"));
		
		Pass.sendKeys("Sampat@123");
		
		WebElement btnLogin= driver.findElement(By.id("loginbutton"));
		
		btnLogin.click();		
		
		
		
		
	}

}
