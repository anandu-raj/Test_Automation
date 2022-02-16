package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GTPLHomePage {

	WebDriver driver;
	WebDriverWait wait;
	
	public GTPLHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By edCustomer = By.xpath("//*[text()='Edit Customer']");
	
	public void homePageTitle(String HPtitle) {
		String actualtitle = HPtitle; 
		String expectedtitle = driver.getTitle(); 
		Assert.assertEquals(expectedtitle,actualtitle ); 
		System.out.println("You entered GTPL Bank Manager HomePage");
	}
	
	public void editCustomerPage() {
		wait = new WebDriverWait(driver, 20);
		WebElement editCustomerMenu=wait.until(ExpectedConditions.visibilityOfElementLocated(edCustomer));
		editCustomerMenu.click();
	}
}
