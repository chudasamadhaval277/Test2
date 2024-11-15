package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferPage {

	WebDriver driver;
	
	public OfferPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By Search = By.xpath("//input[@id='search-field']");
	By productName = By.xpath("//table/tbody/tr/td[1]");
	
	public WebElement Offer_Search() {
		return driver.findElement(Search);
	}
	
	public String Offer_getSearchText() {
		return driver.findElement(Search).getText();
	}
	
	public String Offer_ProductName() {
		return driver.findElement(productName).getText();
	}
}
