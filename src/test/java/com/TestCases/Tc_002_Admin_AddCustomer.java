package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Admin;
import com.ScreenFunctions.Login;

public class Tc_002_Admin_AddCustomer extends GenericFunctions
{

	@Test

	public static void Addcustomer()
	{
				
		launchApplication("firefox");
		
		//Step2:Enter User Credentials
		
		Login lgn=PageFactory.initElements(driver, Login.class);		
		lgn.Admin_Login();
		
		//step3: Add customer
		Admin admin=PageFactory.initElements(driver, Admin.class);
		admin.add_customer();
		
		

	}
}
