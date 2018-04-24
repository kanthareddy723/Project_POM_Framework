package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Admin extends GenericFunctions{

	

	/*************************************************
	
	
	Function Name:Admin
	
	Purpose:-This Function is used to Add Customerdetails
	
	Input Parameters:-Excel
	
	Output Parameters:-This method will return a boolean value 
	
	Author:-K.Umakanth
	
	Creationn date:-04/04/2018
	
	
	**************************************************/
	
//Admin link
	@FindBy(how=How.XPATH,using="//*[text()='Add Customer']")
	
		public static WebElement lnk_admin_addcstrlink;

//edit customer link
	@FindBy(how=How.XPATH,using="//*[text()='Edit customer']")
	
		public static WebElement lnk_admin_editcstr;


	////**************staff*************////


	@FindBy(how=How.XPATH,using="//*[text()='Add staff member']")
	public static WebElement lnk_admin_addstaff;
	
	@FindBy(how=How.XPATH,using="//input[@name='staff_name']")
	public static WebElement txt_staffname;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_gender'][1]")
	public static WebElement rdo_staffGender;
	
	@FindBy(how=How.XPATH,using="//input[@name='staff_dob']")
	public static WebElement txt_StaffDOB;
	

	@FindBy(how=How.XPATH,using="//*[@name='staff_status']")
	public static WebElement lst_StaffRelation;
	

	@FindBy(how=How.XPATH,using="//*[@name='staff_dept']")
	public static WebElement lst_StaffDepartment;
	
	@FindBy(how=How.XPATH,using="//input[@name='staff_doj']")
	public static WebElement txt_StaffDOJ;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_address']")
	public static WebElement txt_StaffAddress;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_mobile']")
	public static WebElement txt_Staffmob;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_email']")
	public static WebElement txt_StaffEmail;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_pwd']")
	public static WebElement txt_Staffpassword;
	
	@FindBy(how=How.XPATH,using="//*[@name='add_staff']")
	public static WebElement btn_AddStaff;
	
/////////**************Customer*********//////////////
	
	//Customername
			@FindBy(how=How.XPATH, using ="//*[@name='customer_name']")
			
				public static WebElement  edi_admin_Customername;
				
	//Gender	
		@FindBy(how=How.XPATH,using="//*[@name='customer_gender'][1]")
		
			public static WebElement rdi_admin_Gender;
		
		
	//DOB
		@FindBy(how=How.XPATH,using="//*[@name='customer_dob']")
			
			public static WebElement edi_admin_DOB;	



		//Nominee
			@FindBy(how=How.XPATH,using="//*[@name='customer_nominee']")
			
				public static WebElement edi_admin_Nominee;

			
		//Branch
				@FindBy(how=How.XPATH, using ="//*[@name='branch']")
				
					public static WebElement  lst_admin_Branch;
					
		//Account type
			@FindBy(how=How.XPATH,using="//*[@name='customer_account']/option[1]")
			
				public static WebElement lst_admin_Account_type;
			
			
		//Minimum balance
			@FindBy(how=How.XPATH,using="//*[@name='initial']")
				
				public static WebElement edi_admin_Minimum_balance;	
			
			//Address
			@FindBy(how=How.XPATH,using="//*[@name='customer_address']")
			
				public static WebElement edi_admin_Address;

			
		//Mobile
				@FindBy(how=How.XPATH, using ="//*[@name='customer_mobile']")
				public static WebElement  edi_admin_mobile;
					
		//Email id		
			@FindBy(how=How.XPATH,using="//*[@name='customer_email']")
			
				public static WebElement edi_admin_email;
			
			
		//Password
			@FindBy(how=How.XPATH,using="//*[@name='customer_pwd']")
				
				public static WebElement edi_admin_password;	

		// Customer button
			
		@FindBy(how=How.XPATH,using="//*[@name='add_customer']")
		public static WebElement btn_admin_AddCustomer;	
		
	
	
	// Logout button
	
		@FindBy(how=How.XPATH,using="//*[text()='Logout']")
		public static WebElement btn_admin_logout;	
	
	//edit customer
		@FindBy(how=How.XPATH,using="//*[@name='customer_id']/parent::td[1]/following-sibling::td[text()='umakanth']")
		public static WebElement rdi_admin_edicstr;	
	//edit button
		@FindBy(how=How.XPATH,using="//*[@name='submit_id']")
		public static WebElement btn_admin_edicstr;
	
/*************************************************
	
	
	Function Name: add_customer
	
	Purpose:-This Function is used to Add Customer details 
	
	Input Parameters:- 
	
	Output Parameters:-This method will return a boolean value whether the data is entered or not 
	
	Author:-K.Umakanth
	
	Creation date:- 04/05/2018(dd/mm/yyyy)
	
	
	**************************************************/
	
	public static boolean add_customer()
	{
		boolean status=true;
		
			//add customer link
		
			status = hoverAndClick(lnk_admin_addcstrlink);
		
			//Enter customer name

			String cstrname=  getdata("Customertestdata","Customername",1);
			status = setdata(edi_admin_Customername, cstrname);
			
			//click gender
			status = hoverAndClick(rdi_admin_Gender);
		
			//Enter DOB
			
			String dob=getdata("Customertestdata","DOB",1);
			status = setdata(edi_admin_DOB, dob);	
		
			//Enter Nominee name
			
			String nominee=getdata("Customertestdata","Nominee",1);
			status = setdata(edi_admin_Nominee, nominee);
		
			//Select branch
			status = Selectlistbox(lst_admin_Branch, "DELHI");
	
			//select Account type
			status = hoverAndClick(lst_admin_Account_type);
	
			//Enter Min Balance
			
			String min_bal=getdata("Customertestdata","Minimum_balance",1);
			status = setdata(edi_admin_Minimum_balance, min_bal);
			
			//Enter Address
			
			String adrs=getdata("Customertestdata","Address",1);
			status = setdata(edi_admin_Address, adrs);
	
			//Enter Mobile No
			
			String mbl=getdata("Customertestdata","Mobile",1);
			status = setdata(edi_admin_mobile, mbl);
			
			//Enter Email_id
			
			String email=getdata("Customertestdata","Email_id",1);
			status = setdata(edi_admin_email, email);
		
			//Enter Password
			
			String pswd=getdata("Customertestdata","Password",1);
			status = setdata(edi_admin_password, pswd);
			
			//Click Submit
			//status = hoverAndClick(btn_admin_AddCustomer);
			
			//click logout
			status = logout(); 
			
			//select editing customer
			//status = hoverAndClick(rdi_admin_edicstr); 
		
			
		return status;
	}
		

	
/*************************************************
	
	
	Function Name: add_staff
	
	Purpose:-This Function is used to Add Staff details 
	
	Input Parameters:- 
	
	Output Parameters:-This method will return a boolean value whether the data is entered or not 
	
	Author:-K.Umakanth
	
	Creation date:- 04/05/2018(dd/mm/yyyy)
	
	
	**************************************************/
	

	
	
	public  boolean admin_AddStaff()
	{
		boolean status = true;
		
		//click on add staff link
		status=hoverAndClick(lnk_admin_addstaff);

		//Enter staffname
		String username = getdata("Customertestdata", "Customername", 1);
		status = setdata(txt_staffname, username);
		
		//select gender
		status = hoverAndClick(rdo_staffGender);
		
		//Enter DOB
		String DOB = getdata("Customertestdata","DOB",1);
		status = setdata(txt_StaffDOB, DOB);

		//select relation
		status = Selectlistbox(lst_StaffRelation, "unmarried");
		//select dept
		status = Selectlistbox(lst_StaffDepartment, "developer");

		//Enter DOJ
		String DOJ = getdata("Customertestdata","DOJ",1);
		status = setdata(txt_StaffDOJ, DOJ);
		
		//Entre address
		String Address = getdata("Customertestdata","Address",1);
		status = setdata(txt_StaffAddress, Address);
		//enter mobile
		String Mobile = getdata("Customertestdata","Mobile",1);
		status = setdata(txt_Staffmob, Mobile);
		//enter email
		String E_mail = getdata("Customertestdata","Email_id",1);
		status = setdata(txt_StaffEmail, E_mail);
		//enter password
		String Password = getdata("Customertestdata","Password",1);
		status = setdata(txt_Staffpassword, Password);
	
		//status = hoverAndClick(btn_AddStaff);
		
		//logout
		status = logout();
		return status;
	}	
	
	
	
/*************************************************


Function Name: edit_customer

Purpose:-This Function is used to Add Staff details 

Input Parameters:- 

Output Parameters:-This method will return a boolean value whether the data is entered or not 

Author:-K.Umakanth

Creation date:- 04/05/2018(dd/mm/yyyy)


**************************************************/

public static boolean edit_customer()
{
	boolean status=true;
	
	//click edit customer link
	status = hoverAndClick(lnk_admin_editcstr);
	
	//click customer id 
	status = hoverAndClick(rdi_admin_edicstr);
	
	//click edit button
	status = hoverAndClick(btn_admin_edicstr);   
	
	//Edit customer name

	String cstrname2=  getdata("Customertestdata","Customername",1);
	status = setdata(edi_admin_Customername, cstrname2);
	
	//logout
	status =logout();
	return status;
}

public static boolean logout()
{
	boolean status = true;
	
	//logout
		status = admin_logout(btn_admin_logout);
		System.out.println("Logout sucuessfully done");
	
	return status;
}
	
	
	
	
	
	
	
		
		
		
}
