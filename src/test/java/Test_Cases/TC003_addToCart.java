package Test_Cases;

import org.testng.annotations.Test;

import TestCase_PageObject.BaseTestClass;
import TestCase_PageObject.addToCart;

public class TC003_addToCart extends BaseTestClass {
	
	@Test
	public void TC003_addToCart_Test() throws InterruptedException
	{
		addToCart sb= new addToCart(driver);
		sb.productDisplay();
	}
	
	
	
	
}
