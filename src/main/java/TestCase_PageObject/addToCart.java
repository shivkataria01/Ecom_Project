package TestCase_PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class addToCart extends BaseTestClass {

    WebDriver driver;

    // Constructor to initialize WebDriver and PageFactory
    public addToCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locating the 'Add to Cart' button
    @FindBy(xpath = "//button[normalize-space()='Buy Now']")
    WebElement addTocart;

    public void productDisplay() throws InterruptedException{


            // Click the 'Add to Cart' button
    	
    	JavascriptExecutor js= (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,4200)");
    	
            addTocart.click();
            Thread.sleep(3000);
    }
}
