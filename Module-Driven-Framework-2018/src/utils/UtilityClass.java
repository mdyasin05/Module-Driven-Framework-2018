package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class UtilityClass {
		
		public static WebDriver driver=null;
		
		
		public static  void maxpage(){
			
			driver.manage().window().maximize();
		}
		
		//==========================================Click Method========================================================
		
		public void clickbyxpath(String locator){
			
			driver.findElement(By.xpath(locator)).click();
		}
		
		public void clickBycssSel(String PAth){
			
			driver.findElement(By.cssSelector(PAth)).click();
		}
		public void ClickbyLinktaxt(String Linktaxt){
			
			driver.findElement(By.linkText(Linktaxt)).click();
		}
		public void ClickBypartial(String parLink){
			
			driver.findElement(By.partialLinkText(parLink)).click();
		}
		public void ClickByID(String location){
			
			driver.findElement(By.id(location)).click();
		}
		
		public void ClickbyName(String locator){
			driver.findElement(By.name(locator)).click();
		}
		
		
		
		
		
		//===================================== Enter value=========================================================
		
		
		public void entervaluebyxpath(String locator,String value){
			
			driver.findElement(By.xpath(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(value);
		}

	    public void CHeckByID(String Location, String Value){
	    	
	    	driver.findElement(By.id(Location)).clear();
	    	driver.findElement(By.id(Location)).sendKeys(Value);
	    }

	    public void CheckBycss(String location, String value){
	    	
	    	driver.findElement(By.cssSelector(location)).clear();
	    	driver.findElement(By.cssSelector(location)).sendKeys(value);
	    }
	    
	    public void CheckByLinkText(String locator, String value){
	    	
	    	driver.findElement(By.partialLinkText(locator)).clear();
	    	driver.findElement(By.linkText(locator)).sendKeys(value);
	    }
	    
	    public void CheckByPartialLinktext(String locator, String value){
	    	
	    	driver.findElement(By.partialLinkText(locator)).clear();
	    	driver.findElement(By.partialLinkText(locator)).sendKeys(value);
	    }
	    
	    
	    
		
		//======================================open browser=========================================================

		
//		public static void openfirefox(String path,String site){
//			
//			System.setProperty("webdriver.gecko.driver", path);
//			driver=new FirefoxDriver();
//			driver.get(site);
//		}
	    public static void openChromeDriver(String Site){
	    	
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tmcon\\workspace\\jar file\\chromedriver_win32\\chromedriver.exe");
	    	driver=new ChromeDriver();
	    	driver.get(Site);
	    }
	    
	    
	    
	//==========================================Drop Down===========================================================

	public void dropdown(String locator, String index){
		
		Select dd=new Select(driver.findElement(By.xpath(locator)));
		dd.selectByVisibleText(index);
	}
	public void dropdown6(String locator, int value){
		
		Select dd=new Select(driver.findElement(By.xpath(locator)));
		dd.selectByIndex(value);
	}

	public void dropdown1(String drop,String Value){
		
		Select dd1=new Select(driver.findElement(By.id(drop)));
		dd1.selectByVisibleText(Value);
	}

	public void dropdown2(String locator,int value){
		
		Select dd2=new Select(driver.findElement(By.cssSelector(locator)));
		dd2.selectByIndex(value);
	}

	public void dropdown3(String locator, String value){
		
		Select dd3=new Select(driver.findElement(By.linkText(locator)));
		dd3.selectByValue(value);
	}

	public void dropdown4(String locator, String value){
		
		Select dd4=new Select(driver.findElement(By.partialLinkText(locator)));
		dd4.selectByVisibleText(value);
		
	}

	public void dropdown5(String locator, String value){
		
		Select dd5=new Select(driver.findElement(By.xpath(locator)));
		dd5.deselectByVisibleText(value);
	}

	//================================dropdown===========================================
	
	public void dropdownusingValue(String loc,String value){
		WebElement selectelements=driver.findElement(By.xpath(loc));
		Select dropdown=new Select (selectelements);
		dropdown.selectByVisibleText(value);
	}
	public void dropdownByIndex(String loc,int x){
		WebElement choseelement=driver.findElement(By.id(loc));
		Select dropdown=new Select(choseelement);
		dropdown.selectByIndex(x);
	}




	//=========================================================GetTaxt==============================================

	public String gettaxtbycss(String locator){
		
		String value=driver.findElement(By.xpath(locator)).getText();
		return value;
	}

	public void gettaxt1(String Locator){
		
		driver.findElement(By.cssSelector(Locator)).getText();
	}

	public void gettaxtbyid(String locator){
		
	    driver.findElement(By.id(locator)).getText();	
	}

	public void getTaxBylinktaxt(String locator){
		
		driver.findElement(By.linkText(locator)).getText();
	}

	public void getTextBypertial(String locator){
		
		driver.findElement(By.partialLinkText(locator)).getText();
	}


	//======================================================Alert======================================================

	public void getByAlart(){
		driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	}


	public void alerttext(String text){
		
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().dismiss();
		
	}


	//=================================================Implicit wait==================================================

	public void Bywait(int time){
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}


	public void webdriverwait(int time,String location ){
		
		WebDriverWait pp=new WebDriverWait(driver,time);
		pp.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(location)));
		
	}

	//=================================================get Title===========================================================

	public void  Titlesite(){
		
		System.out.println("The page Title is: "+ driver.getTitle());
	}


	//================================================close Browser=======================================================

	public void closebrowser(){
		
		driver.quit();
	}



	public void Actions(String hoveroverpath,String clickpath){
		
		WebElement value=driver.findElement(By.xpath(hoveroverpath));
		Actions tc=new Actions(driver);
		tc.moveToElement(value).build().perform();
		driver.findElement(By.xpath(clickpath)).click();
		
		
	}

	//===============================================Select===============================================================

	public void Select(String locator){
	    Select sel1= new Select(driver.findElement(By.xpath(locator)));
	    sel1.selectByIndex(3);

	    
	    
	}

	}
