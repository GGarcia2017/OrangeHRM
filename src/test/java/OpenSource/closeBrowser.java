package OpenSource;

import org.openqa.selenium.WebDriver;

public class closeBrowser {

	WebDriver driver;
	
		public closeBrowser(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void closeChromeBrowser()
	{
		driver.close();
	}
	
}
