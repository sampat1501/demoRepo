package testCases;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int length = 10;
	    boolean useLetters = true;
	    boolean useNumbers = true;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

	    System.out.println(generatedString);
		
				/*System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/POM Project/FacebookTest/Drivers/chromedriver");
				WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("in");
				Thread.sleep(2000);
				List<WebElement> Options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a "));
				System.out.println(Options);
				Thread.sleep(5000);
				for(WebElement option:Options)
				{
					if(option.getText().equalsIgnoreCase("Argentina"));
					
					
					option.click();
					System.out.println(option.getText());
					Thread.sleep(2000);
					option.click();
					break;
				}*/

		
	}
		
	}


