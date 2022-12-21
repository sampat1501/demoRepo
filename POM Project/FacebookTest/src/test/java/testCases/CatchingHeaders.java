package testCases;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CatchingHeaders {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/POM Project/FacebookTest/Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://uat.crelio.solutions/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("saturn-dummy2");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dummy@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[2]/div[1]/ul[1]/div[1]/form[1]/input[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Supplier Management')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Account and Payment')]")).click();
		Thread.sleep(2000);
		List<WebElement> SupplierNames=driver.findElements(By.xpath("//div[@col-id='supplierName']"));
		List <WebElement>Supplerlist=driver.findElements(By.xpath("//div[@class='ag-header-container'] //div[@role='columnheader']"));
		Supplerlist.size();
		for(WebElement Supplier:Supplerlist)
		{
			String txtSupplierName=Supplier.getText();
			//System.out.println(txtSupplierName);
			if(txtSupplierName.equalsIgnoreCase("Account Name"))
			{
				System.out.println(txtSupplierName);
				break;
			}
		}
		for(WebElement SupName:SupplierNames)
		{
			String txtSpname=SupName.getText();
			if(txtSpname.equalsIgnoreCase("Cipla Supplier"))
			{
				System.out.println(txtSpname);
			}
			
		}
		
		
	}

}
