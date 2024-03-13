package Login_Functionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import Helpers.ReadProperties;
import Helpers.WebDriverHelper;
import static WebLocators.XYZLocators.*;
import WebMethods.PageMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import reusableMethods.ReusableMethods;

@Listeners(listeners.Listeners.class)
public class LoginTest 
{
	

	//static XYZLocators by;
	static PageMethods browser;
	static WebDriver driver;
	static String url;
	static ReusableMethods bot;
	  
	
	@BeforeTest
	public void Setup() 
	{
		 driver = WebDriverHelper.getDriver();
		// by = new XYZLocators();
		 browser = new PageMethods(driver);
		 url = ReadProperties.getProperty("xyzbank");
		 bot = new ReusableMethods(driver);
	}	
	
	@Test
	public static void TestLogin() throws InterruptedException
	{
		
		browser.navigateTo(url);
		bot.waitforElement(Cx_login, 3);
		bot.takescreenshot(driver);
		browser.click(Cx_login);
		bot.waitforSeconds(4);
		browser.Select(slt_user, "Harry Potter");
		bot.waitforSeconds(2);
		browser.click(btn_login);
		bot.waitforSeconds(5);
		bot.takescreenshot(driver);
		
		
	
	}
	
	@AfterTest
	public void TearDown() 
	{
		browser.click(btn_logout);
		WebDriverHelper.CloseDriver();
		System.out.println("Browser Closed");
	}
	
	

}
