package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Login;

public class Tc_001_Login extends GenericFunctions
{
	@Test
	public static void admin_login()
	{
		//lanch Browser	
		GenericFunctions.launchApplication("firefox");
		
		//Enter User Credentials
		Login lgn = PageFactory.initElements(driver, Login.class);
		lgn.Admin_Login();
		
	}
	
	
	
}
