package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHelper 
{
	static ChromeDriver driver;
	public static WebDriver getDriver() 
	{
		String filepath = System.getProperty("user.dir");
		System.out.println(filepath);
	//	System.setProperty("webdriver.chrome.driver",filepath+ "/Tools/ChromeDrivers/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void CloseDriver() 
	{
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
		
	}

}
