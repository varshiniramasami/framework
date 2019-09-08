package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods{

	public WelcomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="CRM/SFA") WebElement eleCRMSFA;
	@FindBy(className="decorativeSubmit") WebElement eleLogout;
	
	public HomePage clickCRMSFA() {
		click(eleCRMSFA);
		return new HomePage();
	}
	
	public LoginPage clickLogout() {
		click(eleLogout);
		return new LoginPage();
	}
	

}





