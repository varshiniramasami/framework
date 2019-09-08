package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest()
	public void setData() {

		excelFileName ="TC002_CreateLead";
		category = "Smoke";
		testcaseDec="TC002 CreateLead";
		testcaseName ="TC002";
		author="Abi";
		

	}
	
	@Test(dataProvider="fetchData")
	public void runTC002_CreateLead(String username, String password, String companyname, String firstname, String lastname)
	{
		new LoginPage()
		.enterUserame(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.clickCreateLead();
		

		
	}



}
