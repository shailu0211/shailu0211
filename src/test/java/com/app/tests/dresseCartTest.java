package com.app.tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.dressesCartobject;
import com.app.pages.dressespageobject;

public class dresseCartTest {
	dressesCartobject cart;
	public dresseCartTest() {
	cart=new dressesCartobject();
	}
	
@Test
public void whetheritidaddedtocart(){
	cart.clicktheimage();
	boolean data=cart.verifytheaddtocartbutton();
	 boolean button=cart.verifytheaddtocartbutton();
boolean tweet=	cart.verifythetweetbutton();
	Assert.assertTrue(data);
	Assert.assertTrue( button);
	Assert.assertTrue(tweet);
}
}
