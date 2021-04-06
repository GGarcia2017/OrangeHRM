package OpenSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPanelPassword{
	
	WebDriver driver;
	
	By user = By.id("txtPassword");
	
	public loginPanelPassword(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void PasswordInput (String Id)
	{
		driver.findElement(user).sendKeys(Id);
	}
	

}
