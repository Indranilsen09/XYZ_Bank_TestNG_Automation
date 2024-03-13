package WebMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PageMethods 
{
	static WebDriver driver;
	public PageMethods(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void click(By by) 
	{
		try {
		driver.findElement(by).click();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public  void Select(By by, String text) 
	{
		try {
			Select slt = new Select(driver.findElement(by));
			slt.selectByVisibleText(text);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public  void navigateTo(String url) 
	{
		try {
			
		driver.navigate().to(url);
		
		}catch(Exception e){
		e.printStackTrace();
	}
	}
	
	public void enterText(By by,String text) 
	{
		try {
			driver.findElement(by).sendKeys(text);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
