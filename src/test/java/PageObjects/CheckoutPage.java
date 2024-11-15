package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By cartBag = By.xpath("//img[@alt='Cart']");
	By Proceed_to_Checkout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By apply = By.cssSelector(".promoBtn");
	By placeorder = By.xpath("//button[text()='Place Order']");
	
	
	
	
	public WebElement checkout_cartBag() {
		return driver.findElement(cartBag);
	}
	public WebElement checkout_Proceed_to_Checkout() {
		return driver.findElement(Proceed_to_Checkout);
	}
	public boolean checkout_apply() {
		return driver.findElement(apply).isDisplayed();
	}
	public boolean checkout_placeorder() {
		return driver.findElement(placeorder).isDisplayed();
	}
	
	/*By search = By.xpath("//input[@class='search-keyword']");
	By productName = By.xpath("//h4[@class='product-name']");
	By topDeals = By.xpath("//a[text()='Top Deals']");
	
	public WebElement checkout_search() {
		return driver.findElement(search);
	}
	
	public String checkout_getSearchText() {
		return driver.findElement(search).getText();
	}
	
	public String checkout_getproductName() {
		return driver.findElement(productName).getText();
	}
	
	public WebElement selectTopDealsPage() {
		return driver.findElement(topDeals);
	}*/
}
