package com.leafBot.pages;

import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	

}
