package TestCase_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTestClass {

	public static WebDriver driver;
	
	
	@BeforeTest
	public void LaunchUrl() {

	//System.setProperty("webdriver.http.factory", "jdk-http-client");
		
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/"); 
	driver.manage().window().maximize();
	
}
}
