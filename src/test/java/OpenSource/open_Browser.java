package OpenSource;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class open_Browser {

	WebDriver driver;
	
	String OpenUrl = "OrangeHRM";

	@Test
	public void Environment()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		
	}
	
	@Test
	public void correctloginPage()
	{
		System.out.println("URL before login: " + driver.getCurrentUrl());
		
		Assert.assertEquals(OpenUrl, driver.getTitle()); //GitTest

	}
	
	@Test
	public void SendUser()
	{
		loginPanelUser username = new loginPanelUser(driver);
		
		username.UserInput("Admin");
		
	}
	
	@Test
	public void SendPassword()
	{
		loginPanelPassword password = new loginPanelPassword(driver);
		
		password.PasswordInput("admin123");
		
	}
	
	@Test
	public void clickOnLogIn()
	{
		loginPanelButton button = new loginPanelButton(driver);
		
		button.ButtonClickOn();
		
	}
	
	@Test
	public void LoginConfirmed() throws InterruptedException
	{
		System.out.println("URL after login: " + driver.getCurrentUrl());

		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());
	}
	
	@Test
	public void CloseBrowser()
	{
		closeBrowser close = new closeBrowser(driver);
		
		close.closeChromeBrowser();
		
	}

}
