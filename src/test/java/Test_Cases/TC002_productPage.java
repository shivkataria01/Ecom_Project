package Test_Cases;

import org.testng.annotations.Test;

import TestCase_PageObject.BaseTestClass;
import TestCase_PageObject.SearchBar;

public class TC002_productPage extends BaseTestClass {
	
	@Test
	public void TC002_productPage_Test()
	{
		SearchBar sb= new SearchBar(driver);
		sb.productPage();
	}
	
	
	
	
}
