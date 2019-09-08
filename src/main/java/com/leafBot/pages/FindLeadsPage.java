package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{
	
	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@name='id'])[3]") WebElement eleLeadByID;
	@FindBy(xpath="(//input[@name='firstName'])[3]") WebElement eleLeadByName;
	
	@FindBy(xpath="//span[text()='Phone']") WebElement elePhone;
	@FindBy(xpath="//input[@name='phoneNumber']") WebElement elePhoneNo;
	
	@FindBy(xpath="//span[text()='Email']") WebElement eleEmail;
	@FindBy(xpath="//input[@name='emailAddress']") WebElement eleEmailID;
	@FindBy(xpath="//button[text()='Find Leads']") WebElement eleFindLeads;
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a") WebElement eleFindLeadsList;

	public FindLeadsPage enterNameAndID_ID() {
		clearAndType(eleLeadByID, "10010");
		return this;

	}
	
	public FindLeadsPage enterNameAndID_NameD() {
		clearAndType(eleLeadByName, "Abi");
		return this;
		}
	
	public FindLeadsPage clickPhone() {
		click(elePhone);
		return this;
	}
	public FindLeadsPage enterPhone(String phoneNo) {
		clearAndType(elePhoneNo, phoneNo);
		return this;
	}
	
	public FindLeadsPage clickEmail() {
		click(eleEmail);
		return this;
	}
	public FindLeadsPage enterEmail(String emailID) {
		clearAndType(eleEmailID, emailID);
		return this;
	}
	
	public FindLeadsPage clickFindLeads() throws InterruptedException {
		click(eleFindLeads);
		Thread.sleep(5000);
		return this;
	}
	
	public ViewLeadPage clickLeadList() {
		click(eleFindLeadsList);
		return new ViewLeadPage();
	}

}
