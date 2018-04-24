package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Automation_Practise extends GenericFunctions
{

		@FindBy(how=How.XPATH,using="//*[@id='header']/div[2]/div/div/nav/div/a")
		public static WebElement lnk_signin;
	
		@FindBy(how=How.XPATH,using="//*[contains(@id,'email_create')]")
		public static WebElement edi_email;
	
		@FindBy(how=How.XPATH,using="//*[@id='SubmitCreate']")
		public static WebElement btn_emailbtn;
	
		@FindBy(how=How.XPATH,using="//*[@id='create_account_error']/ol/li")
		public static WebElement txt_emailerrormsg;

		//***********************************************
		@FindBy(how=How.XPATH,using="//*[@id='homefeatured']/li[4]/div/div[1]/div/div[2]/span")
		public static WebElement txt_drscost;
		
		@FindBy(how=How.XPATH,using="//*[@id='homefeatured']/li[4]/div/div[2]/h5/a")
		public static WebElement txt_drstype;
		
		
		
		
		
		//*[@id='homefeatured']/li[4]/div/div/div/a/following-sibling::div/following-sibling::div/span
		
		
		
		
		
		
		
	public boolean email() throws InterruptedException
	{
		Boolean status = true;
		
		status = hoverAndClick(lnk_signin);
		
		boolean e_sts = edi_email.isEnabled();
		System.out.println("Email Textbox status is :"+e_sts);
		
		boolean b_sts = btn_emailbtn.isEnabled();
		System.out.println("Email Button status is :"+b_sts);
		
		String email  = getdata("Customertestdata", "Email_id", 1);
		status = setdata(edi_email, email);
		
		boolean ba_sts = btn_emailbtn.isEnabled();
		System.out.println("After enter data Textbox status is :"+ba_sts);
		
		status = hoverAndClick(btn_emailbtn);
		System.out.println("Button clicked..");
		Thread.sleep(2000);
		
		String ermsg = txt_emailerrormsg.getText();
		System.out.println("Error Message is :"+ermsg);
		return status;
	}
	
	public boolean costcomp() throws InterruptedException
	{
		Boolean status = true;
		
		System.out.println("Haiii it is :"+ txt_drstype.getText());
		String cost1 = txt_drscost.getText();
		Thread.sleep(2000);
		System.out.println("Cost is :"+cost1);
		
		
		
		
		return status;
	}
	
	
}
