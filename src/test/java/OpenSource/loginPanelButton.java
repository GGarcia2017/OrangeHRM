package OpenSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPanelButton{
	
	WebDriver driver;
	
	By user = By.id("btnLogin");
	
	public loginPanelButton(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void ButtonClickOn()
	{
		driver.findElement(user).click();
	}
	

}
