package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.loginObject;
import com.app.pages.searchObjects;

public class testPage {
	loginObject lp;
	searchObjects search;
	
	public testPage() {
		lp=new loginObject();
		search=new searchObjects();
		
	}
	@Test
	public void verifythelogincredentials() {
		lp.login("shailu02","EKHEF6");
	    String usertext=search.getwelcomepage()	;	
	  Assert.assertTrue(usertext.contains("shailu02"),"Failed");
	  
		
	}
	//@Test
	//public void verifytheusertxtbox() {
		//login.setusername("shailu02");
		//login.get
	//}
//lp.login
	

}



