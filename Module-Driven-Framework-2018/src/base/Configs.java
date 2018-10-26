package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.UtilityClass;

public class Configs extends UtilityClass{
	public WebDriver driver;
	
	@BeforeTest
	
	public void beforetest(){
		
		openChromeDriver("https://www.phptravels.net/");
		maxpage();
		Bywait(100);
		
		
		
	}
	
	@AfterTest
	public void aftertest(){
		
		closebrowser();
		
	}
		
	}
	
	
	
	
	
	
	
//	public void Setup() {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tmcon\\workspace\\Search_E-Commerce\\"
//				+ "Jars\\chromedriver_win32\\chromedriver.exe");	
//	       driver=new ChromeDriver();
//	      // driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
//	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	       driver.get("https://www.phptravels.net/");
//	       driver.manage().window().maximize();
//	       driver.manage().deleteAllCookies();
//	}
//	
//
//}
