package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CatchHeaders {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
		System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/POM Project/FacebookTest/Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://uat.crelio.solutions/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("saturn-dummy2");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dummy@1234");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//body/div[2]/div[1]/ul[1]/div[1]/form[1]/input[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Purchase Management')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Place Vendor Order')]")).click();
		Thread.sleep(3000);

		List<WebElement>ColumnHeader=driver.findElements(By.xpath("//div[@class='ag-header-row ag-header-row-column'] /div[@role='columnheader']"));
		int size=ColumnHeader.size();
		List<WebElement> inventoryName=driver.findElements(By.xpath("//div[@col-id='inventoryName']"));
		Thread.sleep(30000);
		System.out.println(inventoryName.size());
		
		for(WebElement Inventory:inventoryName)
		{
			String textName=Inventory.getText();
			
			System.out.println(textName);
		}
		System.out.println(size);
		for(WebElement headername:ColumnHeader)
		{
			String tst=headername.getText();
			System.out.println(tst);
			
		}
		

		
				
	}
}

