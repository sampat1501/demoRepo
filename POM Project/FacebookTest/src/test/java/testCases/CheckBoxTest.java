package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/POM Project/FacebookTest/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

		driver.findElement(By.name("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

		List <WebElement> checkBoxex=driver.findElements(By.xpath("//input[@type='checkbox']"));
				checkBoxex.size();
		
		for(WebElement Checkbox:checkBoxex)
		
		{
			if (Checkbox.getText().equalsIgnoreCase("Option2"))
			{
				Checkbox.click();
			}
		}
		
		
		

	}

}
