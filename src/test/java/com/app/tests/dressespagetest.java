package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.dressespageobject;
import com.app.pages.homepageobjects;

public class dressespagetest {
	dressespageobject  dressespage;
		homepageobjects homepage;
		
		public  dressespagetest() {
			homepage=new homepageobjects();
			dressespage=new dressespageobject();
		}
		@Test
		public void verifyshortcheckbox() {
			homepage.clickDreses();
			dressespage.clickCheckboxshort();
    boolean value=dressespage.verifythecheckboxshort();
    		Assert.assertTrue(value);
		}
	@Test
	public void verifythecountofproducts() {
	homepage.clickDreses();
	 int actual=dressespage.getproductcountfromtheheading();
	int expected=dressespage.getimagesofproducts();
	Assert.assertTrue(actual==expected);
	}
 
}
