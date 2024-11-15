package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks {

	TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}
	
	/*@Before
	public void init_browser() throws IOException {
		
		testcontextsetup.testbase.WebDriverManager();
	}*/
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		
		WebDriver driver = testcontextsetup.testbase.WebDriverManager();
	//	if(scenario.isFailed()) {
			
		//	File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//byte[] fileContent = FileUtils.readFileToByteArray(sourcepath)
		//	scenario.attach(fileContent, "image/png", "image");
		//}
	}
	
	@After
	public void teardown() throws IOException {
		
		testcontextsetup.testbase.WebDriverManager().quit();
	}
}
