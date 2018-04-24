package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.changepswd;


public class Tc_004_Changepassword extends GenericFunctions
{
	@Test
	public static void chpswd()
	{
		//lanch Browser	
		launchApplication("firefox");
		
		//Enter User Credentials
		Login lgn = PageFactory.initElements(driver, Login.class);
		lgn.Admin_Login();
		
		//accessing change password class
		changepswd chp = PageFactory.initElements(driver, changepswd.class);
		chp.chng();
		
		
		
	}
	
	
	
	
}
