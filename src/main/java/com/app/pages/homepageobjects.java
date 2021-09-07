package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobjects extends BasePage {
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement txtWomen;
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement txtDresses;
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement txtTshirt;
	@FindBy(xpath = ("//*[@id=\"newsletter-input\"]"))
	private WebElement txtNewsletter;

	public homepageobjects() {
		PageFactory.initElements(driver, this);
	}

	public void clickwomen() {
		txtWomen.click();
	}

	public void clickDreses() {

		txtDresses.click();
	}

	public void clickTshirt() {

		txtTshirt.click();
	}

	//public void setEmail(String email) {
	//	email.set
	
	//}
	
		
		
		//WebElement emailid = driver.findElement(By.id("submitNewsletter"));
		//emailid.sendKeys("shailuashokk@gmail.com");
		//emailid.sendKeys(Keys.ENTER);
		//txtNewsletter.click();
	

	//private void emailsubscriptionmeassage() {
		// TODO Auto-generated method stub
		
	}

