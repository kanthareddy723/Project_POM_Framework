package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Admin;
import com.ScreenFunctions.Login;

public class Tc_007_Admin_AddStaff extends GenericFunctions
{

	@Test
	public static void diff_scr_logout() {
		// Step1: Lanching browser
		launchApplication("firefox");

		// Step2:Enter User Credentials
		Login lgn = PageFactory.initElements(driver, Login.class);
		lgn.Admin_Login();

		Admin admin = PageFactory.initElements(driver, Admin.class);
		
		// step3: logout while Adding staff
		admin.admin_AddStaff();

		// step5: Logout
		admin.logout();

	}
	
	
}
