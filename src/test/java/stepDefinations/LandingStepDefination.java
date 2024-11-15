package stepDefinations;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LandingStepDefination {

	public WebDriver driver;
	public String productName_LandingPage;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	LandingPage lp;
	
	public LandingStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.lp = testContextSetup.pageObjectManager.getLandingPage();
	}
	
	@Given("user is on greencart landing page")
	public void user_is_on_greencart_landing_page() {
	 	Assert.assertTrue(lp.getTitleLandingPage().contains("GreenKart"));
	} 

	@When("user searched with shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		
		lp.Landing_Search().sendKeys(shortName);
		
		Thread.sleep(5000);
		
		productName_LandingPage = lp.Landing_ProductName().split("-")[0].trim();
		System.out.println(productName_LandingPage +" Extracted from Home page");
		System.out.println(productName_LandingPage +" Extracted from Home page");
		System.out.println(productName_LandingPage +" Extracted from Home page");System.out.println(productName_LandingPage +" Extracted from Home page");
		
	}
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_name_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		
		lp.Landing_Search().sendKeys(shortName);
		Thread.sleep(5000);
		productName_LandingPage = lp.Landing_ProductName().split("-")[0].trim();
		System.out.println(productName_LandingPage +" Extracted from Home page");
	}
	
	@When("Added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String value) throws InterruptedException {
		
		lp.checkout_enter_Quentity().sendKeys(Keys.CLEAR);
		Thread.sleep(2000);
		lp.checkout_enter_Quentity().sendKeys(value);
		lp.checkout_add_to_cart().click();
		
	}
	
}
	

