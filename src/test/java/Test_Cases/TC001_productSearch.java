package Test_Cases;

import org.testng.annotations.Test;

import TestCase_PageObject.BaseTestClass;
import TestCase_PageObject.SearchBar;

public class TC001_productSearch extends BaseTestClass {
	
	@Test
	public void TC001_productSearch_Test() throws InterruptedException
	{
		SearchBar sb= new SearchBar(driver);
		sb.productSearch();
		Thread.sleep(3000);
	}

}
