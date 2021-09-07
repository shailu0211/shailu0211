package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchObjects extends BasePage {
	@FindBy(id="username_show")
	private WebElement hellomessage;
	public  searchObjects() {
		PageFactory.initElements(driver, this);
		
	}
public String getwelcomepage() {
	String Message=getTxtAttribute(hellomessage);
	return Message;
}
	
}
