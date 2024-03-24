package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHelper 
{
	static WebDriver driver;
	public static WebDriver getDriver(String browser) 
	{
		String filepath = System.getProperty("user.dir");
		if(browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",filepath+ "/Tools/ChromeDrivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", filepath+"/Tools/FirefoxDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.edge.driver", filepath+"/Tools/MsEdgeDrivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		System.out.println(browser + " driver started");

		//WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void CloseDriver() 
	{
		driver.manage().deleteAllCookies();
		//driver.close();
		driver.quit();
		
	}

}
