package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dressesCartobject extends BasePage{
@FindBy(xpath="//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")
private WebElement pathofimages;
@FindBy(xpath="//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]")
private WebElement towardsaddingcart;
@FindBy (xpath="//*[@id='product']/div/div/div[2]/p[7]/button[1]")
private WebElement presenceoftweet;
@FindBy (xpath="//*[@id='product']/div/div/div[2]/p[7]/button[2]")
private WebElement presenceofsharebutton;

public  dressesCartobject() {
	PageFactory.initElements(driver, this);
}

public void clicktheimage() {
	pathofimages.click();
}
public boolean verifytheaddtocartbutton() {
	 Boolean value=towardsaddingcart.isSelected();
	return value;
	}
public boolean verifythetweetbutton() {
	boolean output=presenceoftweet.isDisplayed();
	return output;
}

public boolean verifythesharebutton()
{
	boolean result=presenceofsharebutton.isDisplayed();
			return result;
}





}

