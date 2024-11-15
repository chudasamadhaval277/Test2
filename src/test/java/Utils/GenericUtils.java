package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void SwitchWindowToChild() {
		
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1 = s1.iterator();
		
		String paraentwindow = i1.next();
		String childwindow = i1.next();
		
		driver.switchTo().window(childwindow);
	}
}
