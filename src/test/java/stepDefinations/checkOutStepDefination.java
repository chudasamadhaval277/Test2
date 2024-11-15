package stepDefinations;

import org.testng.Assert;

import PageObjects.CheckoutPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkOutStepDefination {

	TestContextSetup testcontextsetup;
	CheckoutPage cp;
	
	public checkOutStepDefination(TestContextSetup testcontextsetup) {
	
		this.testcontextsetup = testcontextsetup;
		this.cp = testcontextsetup.pageObjectManager.getCheckoutPage();
	}
	

	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_tom_items_in_checkout_page(String shortname) {
		
		cp.checkout_cartBag().click();
		cp.checkout_Proceed_to_Checkout().click();
		
	}

	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws InterruptedException {
		
		Thread.sleep(2000);
		Assert.assertTrue(cp.checkout_apply());;
		Assert.assertTrue(cp.checkout_placeorder());
	}
	
	
}
