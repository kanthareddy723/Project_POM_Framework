package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Automation_Practise;
import com.ScreenFunctions.Login;

public class TC_01_Automationpractise extends GenericFunctions
{
	@Test
	public static void ap() throws InterruptedException
	{
		launchApplication("firefox");
		
		Automation_Practise ap1=PageFactory.initElements(driver, Automation_Practise.class);		
		//ap1.email();
		ap1.costcomp();
		
	}
	
	
	
}
