package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods{
	public LeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead") WebElement eleLeads;
	@FindBy(linkText="Find Leads") WebElement eleFindLeads;
	public CreateLeadPage clickCreateLead() {
		click(eleLeads);
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeads() {
		click(eleFindLeads);
		return new FindLeadsPage();
	
	}
}
