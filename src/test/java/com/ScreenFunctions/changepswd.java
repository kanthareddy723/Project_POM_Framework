package com.ScreenFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class changepswd extends GenericFunctions
{

	

	/*************************************************
	
	
	Function Name:Admin
	
	Purpose:-This Function is used to Add Change password
	
	Input Parameters:-Excel
	
	Output Parameters:-This method will return a boolean value 
	
	Author:-K.Umakanth
	
	Creation date:-04/10/2018
	
	
	**************************************************/
	
	
	@FindBy(how=How.XPATH,using="//*[text()='Change password']")
	
	public static WebElement lnk_admin_cngpswd;
	
	@FindBy(how=How.XPATH,using="//*[@name='old_password']")
	
	public static WebElement edi_admin_oldpassword;
	
	@FindBy(how=How.XPATH,using="//*[@name='new_password']")
	
	public static WebElement edi_admin_newpassword;
	
	@FindBy(how=How.XPATH,using="//*[@name='again_password']")

	public static WebElement edi_admin_cnfmpassword;

	@FindBy(how=How.XPATH,using="//*[@name='change_password']")

	public static WebElement btn_admin_cngpswd;
	
	
	public static boolean chng()
	{
		boolean status = true;
		
		hoverAndClick(lnk_admin_cngpswd);
		List<WebElement> abc = driver.findElements(By.cssSelector("input:invalid"));
		int count  = abc.size();
		System.out.println(count);
		
		String s  = getCommontestdata("Password");
		status = setdata(edi_admin_oldpassword, s);
			
		String s1  = getCommontestdata("Password");
		status = setdata(edi_admin_oldpassword, s1);
		
		String s2  = getCommontestdata("Password");
		status = setdata(edi_admin_oldpassword, s2);
		
		
		List<WebElement> abcd = driver.findElements(By.cssSelector("input:invalid"));
		int count1 = abcd.size();
		System.out.println(count1);
		
		if(count1==0)
		{
			System.out.println("Able to change password");	
		}
		else
		{
			System.out.println("Unable to change password");
		}
		
		return status;
	}
	
}
