package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
static WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeMethod
	public void beforemethod(String browser, String url)
	{
		
		Ibrowser(browser,url);
	}
	
	
	
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
		System.out.println("browser closed");
	}
	
	public static WebDriver Ibrowser(String NameOfBrowser, String url) {
		if(NameOfBrowser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
				driver=new ChromeDriver();
			
			
		}
		else if(NameOfBrowser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			
		}
			driver.manage().window().maximize();
		
			driver.manage().deleteAllCookies();
			driver.get(url);
		
			return driver;
	

	}
	
	
}
