package TestCase_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		Thread.sleep(6000);
		
		clickFromPopUpSearch.click();
		Thread.sleep(3000);
		
	}
	
	
	
	@FindBy(xpath="(//div[@class='_4WELSP'])[1]")
	WebElement productPage;
	
	public void productPage()
	{
		productPage.click();
		
	}
	

}
