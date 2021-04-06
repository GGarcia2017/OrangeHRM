package OpenSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPanelUser{
	
	WebDriver driver;
	
	By user = By.id("txtUsername");
	
	public loginPanelUser(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void UserInput (String Id)
	{
		driver.findElement(user).sendKeys(Id);
	}
	

}
