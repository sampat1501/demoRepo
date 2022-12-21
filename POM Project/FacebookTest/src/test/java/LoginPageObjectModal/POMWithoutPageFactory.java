package LoginPageObjectModal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMWithoutPageFactory {
	
	WebDriver driver=new ChromeDriver();
	
	POMWithoutPageFactory(WebDriver d)
	{
		driver=d;
		
	}
	//find elements by locating strategy
	
	By Username=By.id("email");
	
	By Password= By.id("pass");
	
	By btnLogin= By.id("loginbutton");
	
	public void enterUsername(String Unm)
	{
		driver.findElement(Username).sendKeys(Unm);

		
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(Password).sendKeys(pwd);

		
	}
	
	public void clickBtn()
	{
		driver.findElement(btnLogin).click();
	}
	
	

}
