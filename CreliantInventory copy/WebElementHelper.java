package CommonMethods;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebElementHelper extends BaseClass{


	// Verify element is required
	public static String elementIsRequired(By locator) {
		String required = null;

		required=driver.findElement(locator).getAttribute("required");

		return required;
	}

	// To verify element is present on web page
	public Boolean isElementPresent(By locator) {

		driver.findElement(locator);
		return true;

	}

	// To verify element is enabled
	public Boolean isElementEnable(By locator){

		driver.findElement(locator).isEnabled();
		return true;

	}

	// To verify element is displayed

	public Boolean isElementDisplayed(By locator){

		driver.findElement(locator).isDisplayed();
		return true;

	}

	// To verify element is visible on web page
	public static Boolean isElementVisible(By locator){

		driver.findElement(locator).isDisplayed();
		return true;


	}

	public static Boolean isElementVisible(String locator){

	return	driver.findElement(By.xpath(locator)).isDisplayed();
		


	}

	// To get/retrieve text of element 
	public static String getElementText(By locator) {
		String text = null;

		text=driver.findElement(locator).getText();
		return text;
	}

	// To get/retrieve attribute of element 
	public String getElementAttiribute(By locator, String type) {
		String text = null;

		text=driver.findElement(locator).getAttribute(type);
		return text;
	}

	// wait till condition 
	public static void ElementPresenceWait(By locator, Duration.seconds ) {
		// explicit wait condition
		WebDriverWait w = new WebDriverWait(driver,Duration);
		// presenceOfElementLocated condition
		w.until(ExpectedConditions.presenceOfElementLocated (locator));

	}

	/**
	 * @Method To verify data is sorted with ascending and descending order
	 * @author Pranali Kanthekar
	 * @param xpath of column, xpath of sort icon
	 */
	public static void isDataSorted(By colLocator , By iconSortLocator) throws InterruptedException {

		//capture all elements into list
		List<WebElement> elementsList=driver.findElements(colLocator);
		List<String> strList =new ArrayList<String>();

		//capture all elements text into original list
		for(WebElement element : elementsList) {
			String type= element.getText();
			strList.add(type);
		}
	//	System.out.println("Before first click is :"+strList);
		//first click showing data in ascending order
		// Click on sort icon
		JavaScriptExecutor.highLighterElement(iconSortLocator);
		ButtonHelper.ClickButton(iconSortLocator);

		elementsList=driver.findElements(colLocator);
		List<String> strList2 =new ArrayList<String>();

		for(WebElement element2 : elementsList) {
			//	System.out.println("BeforeSort : "+element.getText());
			String type= element2.getText();
			strList2.add(type);
		}
	//	System.out.println("After first click is :"+strList2);

		if(strList.equals(strList2)) {
			Assert.assertTrue(true, "Result is in Ascending sorted order");
		}
		else {
			Assert.assertTrue(false, "Result is not in Ascending sorted order");

		}
		Thread.sleep(5000);
		// Descending logic
		Collections.sort(strList);  
		Collections.reverse(strList);
		System.out.println("Revered list is: "+strList);
		ButtonHelper.ClickButton(iconSortLocator);

		elementsList=driver.findElements(colLocator);
		List<String> strList3 =new ArrayList<String>();

		for(WebElement element3 : elementsList) {
			//	System.out.println("BeforeSort : "+element.getText());
			String type= element3.getText();
			strList3.add(type);
		}
	//	System.out.println("After 2nd clicked on sort" +strList3);

		// Assert.assertEquals(strList, strList2);
		if(strList.equals(strList3)) {
			Assert.assertTrue(true, "Result is in Descending sorted order");
		}
		else {
			Assert.assertTrue(false, "Result is not in Descending sorted order");

		}
	}

	/**
	 * @Method To verify filter 
	 * @author Pranali Kanthekar
	 * @param xpath of filter icon , xpath of applied cloumn
	 */
	public static void isDataFilterwithCheckbox( String filterIcon, String colFilterLocator) throws InterruptedException {
		
		driver.findElement(By.xpath(filterIcon)).click();
		
		List<WebElement> elementsList=driver.findElements(By.xpath("(//div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div[2]/input)"));
		int cnt=elementsList.size();

		List<String> strList =new ArrayList<String>();
		Thread.sleep(5000);
		
		//Uncheck select all checkbox
		driver.findElement(By.xpath("(//div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div[2]/input)[1]")).click();
		
		//Again click on filter icon to open filter
		driver.findElement(By.xpath(filterIcon)).click();
		for(int i=2;i<=cnt;i++) 
		{
			

			String selectedText=WebElementHelper.getElementText(By.xpath("(//div[@class='ag-input-field-label ag-label ag-checkbox-label'])"+"["+i+"]"));
		//	System.out.println("selected text is:"+selectedText);
			driver.findElement(By.xpath("(//div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div[2]/input)"+"["+i+"]")).click();
			Thread.sleep(5000);
			
			// Column count
			Thread.sleep(5000);

			List<WebElement> colList=driver.findElements(By.xpath(colFilterLocator));
			int Colcnt=colList.size();
		//	System.out.println("Column count is: "+Colcnt);
		
			List<String> strList1 =new ArrayList<String>();
			Thread.sleep(5000);

			if(selectedText != "(Blank)") 
			{
				
			
			for(int j=1;j<Colcnt;j++) {
				String selectedCOlText=WebElementHelper.getElementText(By.xpath(colFilterLocator+"["+(j)+"]"));		
				//	System.out.println("Column text is :"+selectedCOlText.substring(1));
				if(selectedCOlText.contains("#")) {
					selectedCOlText.substring(1);
				}
				
				if(selectedText.equals(selectedCOlText)) {
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);

				}
			}
			}
			//Again click on filter icon to open filter
			driver.findElement(By.xpath(filterIcon)).click();
			driver.findElement(By.xpath("(//div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div[2]/input)"+"["+i+"]")).click();
			//Again click on filter icon to open filter
			driver.findElement(By.xpath(filterIcon)).click();
		}
		//check select all after test
		driver.findElement(By.xpath("(//div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div[2]/input)[1]")).click();

	}


}
