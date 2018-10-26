package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import utils.Utils_Class;

public class Configs extends Utils_Class{
	public WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tmcon\\workspace\\Search_E-Commerce\\"
				+ "Jars\\chromedriver_win32\\chromedriver.exe");	
	       driver=new ChromeDriver();
	       driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.get("https://www.phptravels.net/");
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	}
	

}
