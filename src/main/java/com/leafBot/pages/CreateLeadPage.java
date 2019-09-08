package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	@CacheLookup
	@FindBy(id="createLeadForm_companyName") WebElement elecompanyname;
	@FindBy(id="createLeadForm_firstName") WebElement elefirstname;
	@FindBy(id="createLeadForm_lastName") WebElement elelastname;
	@FindBy(className="smallSubmit") WebElement eleCreateLead;
	public CreateLeadPage enterCompanyName(String companyname) {
		clearAndType(elecompanyname, companyname);
		return this;
	}

	public CreateLeadPage enterFirstName(String firstname) {		
		clearAndType(elefirstname, firstname);
		return this;
	}

	public CreateLeadPage enterLastName(String lastname) {
		clearAndType(elelastname, lastname);
		return this;
	}

	
	public ViewLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage();
	}
	

}
