package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String productName_LandingPage;
	public String ProductName_OfferPage;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public GenericUtils genericutils;
	
	public TestContextSetup() throws IOException {
		
		testbase = new TestBase();
		pageObjectManager = new PageObjectManager(testbase.WebDriverManager());
		genericutils = new GenericUtils(testbase.WebDriverManager());
	}
	
}
