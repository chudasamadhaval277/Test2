package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");
		
		if(driver == null) {
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
				driver = new ChromeDriver();		
			}else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}else {
				System.out.println("Browser are not found");
			}
			driver.get(url);
		}
		return driver;
	}

}
