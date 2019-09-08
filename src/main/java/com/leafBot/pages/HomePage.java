package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Leads") WebElement eleLeads;

	public LeadsPage clickLeads() {
		click(eleLeads);
		return new LeadsPage();
	}




}
