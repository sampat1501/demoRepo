package CommonMethods;

import org.openqa.selenium.By;
import org.testng.Assert;

public class appsCommon extends BaseClass{

	public static By btnRegOpenSettings=By.xpath("//button[@id='reg-btn']");
	public static By registerSettingsModule=By.xpath("//div[@id='registration-setting-modal']");
	public static By btnAdvanceSetting=By.xpath("//li[@id='tab-item-quick-setting-tab-2']");
	public static By radioDefaultForm=By.xpath("//input[@id='registration-form-layout-radio-btn-0']");
	public static By radioUSForm=By.xpath("//input[@id='registration-form-layout-radio-btn-1']");
	
	public static By btnSaveRegSettings=By.xpath("//button[@id='resgistation-savebtn']");
	public static By btnCancelRegSettings=By.xpath("//button[@id='registration-cancilbtn']");
	public static By lblDefaultFormName=By.xpath("//label[@id='patientNameInputSearch']");
	public static By lblUSForm=By.xpath("//label[@id='referral']");
	
	
	/**
	 * @Method Set Default register patient form layout
	 * @author Pranali Kanthekar
	 * @param 
	 */
	public static void setDefaultRegisterForm() throws InterruptedException {
		WebElementHelper.ElementPresenceWait(btnRegOpenSettings,10);
		ButtonHelper.ClickButton(btnRegOpenSettings);
		WebElementHelper.ElementPresenceWait(btnAdvanceSetting,10);

		if(WebElementHelper.isElementVisible(registerSettingsModule))
		{
			ButtonHelper.ClickButton(btnAdvanceSetting);
			Thread.sleep(5000);
			ButtonHelper.ClickButton(btnAdvanceSetting);

			JavaScriptExecutor.scrollToBottom();
		//	WebElementHelper.ElementPresenceWait(radioDefaultForm,10);
			String radioStatus=driver.findElement(radioDefaultForm).getAttribute("checked");
			if(radioStatus!="checked") 
			{
				ButtonHelper.ClickButton(radioDefaultForm);

				ButtonHelper.ClickButton(btnSaveRegSettings);
				Assert.assertTrue(true,"Radio button is selected");

			}
			else {		
				ButtonHelper.ClickButton(btnCancelRegSettings);
				Assert.assertTrue(false,"Radio button is not selected");

			}
			WebElementHelper.ElementPresenceWait(btnAdvanceSetting,10);

			if(WebElementHelper.isElementVisible(lblDefaultFormName)==true)
			{
				logger.pass("Default form is displayed");
				Assert.assertTrue(true,"Default form is displayed");

			}
			else {
				logger.fail("Default form is not displayed");
				Assert.assertTrue(false,"Default form is not displayed");
			}
		}
		else {
			logger.fail("Register settings module is not displayed");
			Assert.assertTrue(false,"Register settings module is not displayed");
		}
	}
	
	/**
	 * @Method Set US form layout to register US patient 
	 * @author Pranali Kanthekar
	 * @param 
	 */
	public static void setUSRegisterForm() throws InterruptedException {
		WebElementHelper.ElementPresenceWait(btnRegOpenSettings,10);
		ButtonHelper.ClickButton(btnRegOpenSettings);
		WebElementHelper.ElementPresenceWait(btnAdvanceSetting,10);

		if(WebElementHelper.isElementVisible(registerSettingsModule))
		{
			ButtonHelper.ClickButton(btnAdvanceSetting);
			Thread.sleep(5000);
			ButtonHelper.ClickButton(btnAdvanceSetting);

			JavaScriptExecutor.scrollToBottom();
		//	WebElementHelper.ElementPresenceWait(radioDefaultForm,10);
			String radioStatus=driver.findElement(radioUSForm).getAttribute("checked");
			if(radioStatus!="checked") 
			{
				ButtonHelper.ClickButton(radioUSForm);

				ButtonHelper.ClickButton(btnSaveRegSettings);
				Assert.assertTrue(true,"Radio button is selected");

			}
			else {		
				ButtonHelper.ClickButton(btnCancelRegSettings);
				Assert.assertTrue(false,"Radio button is not selected");

			}
			WebElementHelper.ElementPresenceWait(btnAdvanceSetting,10);

			if(WebElementHelper.isElementVisible(lblUSForm)==true)
			{
				logger.pass("US form is displayed");
				Assert.assertTrue(true,"US form is displayed");

			}
			else {
				logger.fail("US form is not displayed");
				Assert.assertTrue(false,"US form is not displayed");
			}
		}
		else {
			logger.fail("Register settings module is not displayed");
			Assert.assertTrue(false,"Register settings module is not displayed");
		}
	}
	
	/**
	 * @Method Generate dummy US mobile number
	 * @author Pranali Kanthekar
	 * @return mobilenumber 
	 */
	public static String generateRandomMobileNumber() {
		
		driver.get("https://randommer.io/Phone");
		WebElementHelper.ElementPresenceWait(By.id("button-get-phone-number"),10);
		JavaScriptExecutor.scrollToElement(By.xpath("(//div[@id='div-result'])"));
		driver.findElement(By.id("button-get-phone-number")).click();
		String mobileNo=driver.findElement(By.xpath("(//div[@id='div-result'])")).getText();
		
		NavigationHelper.navigateBack();
		System.out.println("Mobile number is: "+mobileNo);
		return mobileNo;
		
	}
	
	
	public static By btnUpdateAndBill=By.xpath("//button[text()='Update and bill']");
	
		public static void registerDefaultPetient() throws InterruptedException {
			
			setDefaultRegisterForm();
			
			//Enter patient name
			
			if(WebElementHelper.isElementVisible(btnUpdateAndBill)) {
				logger.info("You are updating the existing patient");
				//Enter
			}
		}
	
}
