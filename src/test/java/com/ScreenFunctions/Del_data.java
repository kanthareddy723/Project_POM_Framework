package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Del_data extends GenericFunctions
{
	

	/*************************************************
	
	
	Function Name:Admin
	
	Purpose:-This Function is used to Add Delete customer
	
	Input Parameters:-Excel
	
	Output Parameters:-This method will return a boolean value 
	
	Author:-K.Umakanth
	
	Creationn date:-04/10
	/2018
	
	
	**************************************************/
	
	
	//delete staff declaration
	@FindBy(how=How.XPATH,using="//*[text()='Delete staff']")
	public static WebElement lnk_admin_delstf;
	
	//delete customer declaration
	@FindBy(how=How.XPATH,using="//*[text()='Delete customer']")
	public static WebElement lnk_admin_delcst;
	
	//click on delete button declaration
	@FindBy(how=How.XPATH,using="//*[@name='submit2_id']")
	public static WebElement btn_admin_del;
	
	//Method for delete staff
	public static boolean del_staff()
	{
		boolean status = true;
		
		//clicking on link admin delete staff
		status = hoverAndClick(lnk_admin_delstf);
		
		//accessing get data method 
		String data_name = getdata("Customertestdata", "Customername", 1);
		String data_email = getdata("Customertestdata", "Email_id", 1);
		System.out.println(data_name);
		System.out.println(data_email);
		
		status = selectradio(data_name, data_email);

		//clicking on button admin delete
		status = hoverAndClick(btn_admin_del);
		System.out.println(data_name+"is Deleted");
		//it will return status
		return status;
	}
	
	
	
	//Method for delete customer
	public static boolean del_customer()
	{
		boolean status = true;
		
		//clicking on link admin delete customer
		status = hoverAndClick(lnk_admin_delcst);
		//status = hoverAndClick(lnk_admin_selstf);
		
		//Accessing get data from generic functions
		String data_name = getdata("Customertestdata", "Customername", 2);
		String data_email = getdata("Customertestdata", "Email_id", 2);
		System.out.println(data_name);
		System.out.println(data_email);
		
		status = selectradio(data_name, data_email);

		//Clicking on button admin del
		status = hoverAndClick(btn_admin_del);
		System.out.println(data_name+"is Deleted");
		//it will return
		return status;
	}
	
	
	
	
	
	
	
	
	
	
	
}
