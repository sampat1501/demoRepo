package Inventory.CreliantInventory;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndtoendTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		List<WebElement> Cities=driver.findElements(By.xpath("//ul[@id='ui-id-1'] //a"));
		
		for(WebElement city:Cities)
		{
			if(city.getText().equalsIgnoreCase("India"))
			{
				city.click();
			}
		}
		
List<WebElement>RadioBttns=driver.findElements(By.id("//div[@id='travelOptions'] //input[@type='radio']"));
		
		for(WebElement Radio:RadioBttns)
			
		{
			System.out.println(Radio);
			if(Radio.getText().equalsIgnoreCase("Round Trip"))
			{
				Radio.click();
			}
		}
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();	
		Thread.sleep(20000);
		List<WebElement> cities1=driver.findElements(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //ul //a"));
		driver.findElement(By.xpath("//a[contains(text(),'Ahmedabad (AMD)')]")).click();
		
		for(WebElement City1:cities1)
		{
			String cityname=City1.getText();			//System.out.println(City1);
			
			if(City1.getText().equalsIgnoreCase("Jaipur (JAI)"))
			{
				System.out.println(cityname);
				City1.click();
			}
		}
		
		
		
	
				
	}
}	
		

	


