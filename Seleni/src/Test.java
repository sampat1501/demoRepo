import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hellow");
		
			
			System.setProperty("webdriver.chrome.driver", "/Users/apple/eclipse-workspace/Inventory-V5/Drivers/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
	}
}
