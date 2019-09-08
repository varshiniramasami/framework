package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class DeleteLead extends ProjectSpecificMethods{
	
	@BeforeTest()
	public void setData() {

		excelFileName ="TC003_DeleteLead";
		category = "Smoke";
		testcaseDec="TC003 DeleteLead";
		testcaseName ="TC003";
		author="Abi";

	}
	
	@Test(dataProvider="fetchData")
	public void runTC002_DeleteLead(String username, String password, String phoneNo) throws InterruptedException
	{
		new LoginPage()
		.enterUserame(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.enterPhone(phoneNo)
		.clickFindLeads()
		.clickLeadList()
		.getLeadID()
		.clickDelete();
	}	
		
	

}
