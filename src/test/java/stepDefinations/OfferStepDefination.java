package stepDefinations;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OfferPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfferStepDefination {

	public WebDriver driver;
	public String ProductName_OfferPage;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	public OfferStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("user searched for {string} shortname in offer page")
	public void user_searched_for_same_shortname_in_offer_page(String shortName) {
		
		switchToOfferPage();
		
		OfferPage op = testContextSetup.pageObjectManager.getOfferPage();
		
		op.Offer_Search().sendKeys(shortName);
		
		ProductName_OfferPage = op.Offer_ProductName();
		
		System.out.println(ProductName_OfferPage + " Extracted from offer page");
		System.out.println(ProductName_OfferPage + " Extracted from offer page");
	}
	
	public void switchToOfferPage() {
		
		LandingPage lp = testContextSetup.pageObjectManager.getLandingPage();
		lp.Landing_TopDeals().click();
		
		testContextSetup.genericutils.SwitchWindowToChild();
		
	}
	
	@Then("validate product name in offer page matches with landing page")
	public void validate_product_name_in_offer_page_matches_with_landing_page() {
		
		Assert.assertEquals(testContextSetup.productName_LandingPage, testContextSetup.ProductName_OfferPage);
	}
	
	@Then("^user searched for (.+) shortname in offer page$")
	public void user_searched_for_name_shortname_in_offer_page(String shortName) {
		
		switchToOfferPage();
		
		OfferPage op = testContextSetup.pageObjectManager.getOfferPage();
		
		op.Offer_Search().sendKeys(shortName);
		
		ProductName_OfferPage = op.Offer_ProductName();
		
		System.out.println(ProductName_OfferPage + " Extracted from offer page");
		System.out.println(ProductName_OfferPage + " Extracted from offer page");
	}
}
