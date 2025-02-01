package TestCase_PageObject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchBar extends BaseTestClass {
	
	WebDriver driver;
	
	public SearchBar(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")
	WebElement searchbox;
	
	
	@FindBy(xpath="(//li[@class='_3D0G9a'])[1]")
	WebElement clickFromPopUpSearch;
	
	public void productSearch() throws InterruptedException
	{
		searchbox.sendKeys("Mobile");
		Thread.sleep(3000);
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='_3D0G9a'])[1]")));
		
		clickFromPopUpSearch.click();
		Thread.sleep(3000);
		
	}
	
	
	
	@FindBy(xpath="(//div[@class='_4WELSP'])[1]")
	WebElement productPage;
	
	public void productPage()
	{
		productPage.click();
		
	}
	
	public void ScreenShot() throws IOException
	{
	
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir");
		FileUtils.copyFile(src, new File(path + "\\ScreenShotCapture\\ss.png"));
		
	}
	

}
