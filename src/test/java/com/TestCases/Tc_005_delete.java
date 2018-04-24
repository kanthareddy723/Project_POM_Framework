package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Del_data;
import com.ScreenFunctions.Login;

public class Tc_005_delete extends GenericFunctions 

{

	@Test

	public static void Addcustomer()
	{
		//Step1: lanch Browser		
		GenericFunctions.launchApplication("firefox");
		
		//Step2:Enter User Credentials
		
		Login lgn=PageFactory.initElements(driver, Login.class);		
		lgn.Admin_Login();
		
		Del_data del = PageFactory.initElements(driver, Del_data.class);
		//del.del_staff();
		
		//Step3: Delete customer
		del.del_customer();
	
	}	
}