package testAll;

import org.testng.annotations.Test;

import base.Configs;
import locators.Locator_Class;
import values.Value_Class;

public class Login_Functionality_Testing extends Configs {
	
	Locator_Class loc=new Locator_Class();
	Value_Class val= new Value_Class();
	

	@Test
	public void loginFunction() {
		
		clickby(loc.MyAcc);
		clickby(loc.click_Signup);
		typebyxpath(loc.first_name,val.first_name);
		typebyxpath(loc.lastname,val.lastname);
		typebyxpath(loc.mobile_Number,val.mobile_Number);
		typebyxpath(loc.email,val.email);
		typebyxpath(loc.password,val.password);
		typebyxpath(loc.conform_password,val.conform_password);
		clickby(loc.button_click);
		
		
		
		
		
		
		
	}
	
}
