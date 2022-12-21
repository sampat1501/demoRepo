package com.TestData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/CreliantInventory/Drivers/chromedriver");
		driver.get("https://uat.crelio.solutions/inventory-v5/#/purchase-management/place-vendor-order");
		List<WebElement> Inventorirs=driver.findElements(By.xpath("https://uat.crelio.solutions/inventory-v5/#/purchase-management/place-vendor-order"));
		
		for(WebElement Inventory:Inventorirs)
		{
			System.out.println(Inventory);
		}

	}

}
