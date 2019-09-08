package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public String deletedID;	
	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Delete']") WebElement eleDelete;
	@FindBy(id="viewLead_companyName_sp") WebElement deleteID;
	
	public MyLeadsPage clickDelete() {
		click(eleDelete);
		return new MyLeadsPage();
	}

	public ViewLeadPage getLeadID() {
		deletedID = getTypedText(deleteID);
		//String deltedID = getTypedText(deleteID);
		return this;
	}

}
