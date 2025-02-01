package TestCase_PageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
