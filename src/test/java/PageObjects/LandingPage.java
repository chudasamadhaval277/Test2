package PageObjects;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By Search = By.xpath("//input[@class='search-keyword']");
	//By productName = By.xpath("//h4[@class='product-name']");

	By productName = By.xpath("//h4[@class='product-name']");
	//By productName = By.cssSelector(".product-name");
	By Top_Deals = By.xpath("//a[text()='Top Deals']");
	
	By enter_Quentity = By.cssSelector(".quantity");
	By add_to_cart = By.xpath("//button[text()='ADD TO CART']");
	
	public WebElement Landing_Search() {
		return driver.findElement(Search);
	}
	
	public String Landing_getSearchText() {
		return driver.findElement(Search).getText();
	}
	
	public String Landing_ProductName() {
		return driver.findElement(productName).getText();
	}
	
	public WebElement Landing_TopDeals() {
		return driver.findElement(Top_Deals);
	}
	
	
	public WebElement checkout_enter_Quentity() {
		return driver.findElement(enter_Quentity);
	}
	public WebElement checkout_add_to_cart() {
		return driver.findElement(add_to_cart);
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
}
