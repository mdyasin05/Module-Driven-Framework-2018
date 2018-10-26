package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utils_Class {
	WebDriver driver;

	public void typebyxpath(String loc, String val) {
		driver.findElement(By.xpath(loc)).sendKeys(val);	
	}
	public void typebyxpath1(String loc, String val) {
		driver.findElement(By.xpath(loc)).sendKeys(val);	
	}
	
	public void typebycssSelector(String loc, String val) {
		driver.findElement(By.xpath(loc)).sendKeys(val);
	}
	
	public void typebyid(String loc, String val) {
		driver.findElement(By.xpath(loc)).sendKeys(val);	
   }

	public void typebyname(String loc, String val) {
		driver.findElement(By.xpath(loc)).sendKeys(val);
	}
	
	public void typebytagname(String loc, String val) {
		driver.findElement(By.xpath(loc)).sendKeys(val);
	}
	
	public void typebylinktext(String loc, String val) {
		driver.findElement(By.xpath(loc)).sendKeys(val);
	}
	
	public void clickby(String loc) {
		driver.findElement(By.xpath(loc)).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
   }

