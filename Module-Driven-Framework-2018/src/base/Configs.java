package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.UtilityClass;

public class Configs extends UtilityClass {

	String browser = "ch";

	@BeforeTest
	public void openChromeDriver() {

		if (browser.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\tmcon\\workspace\\jar file" + "\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else {
			System.out.println("Please verify the Home page...........");
		}

		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@AfterTest
	public void aftertest() {

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
