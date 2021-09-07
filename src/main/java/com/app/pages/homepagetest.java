package com.app.pages;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class homepagetest {
homepageobjects hp;
BasePage bp;
 int randomvalue= new Random().nextInt(500000);
public  homepagetest() {
	hp=new homepageobjects();
	bp=new BasePage();
}

@Test
public void verifyhomepagetabs() {
	hp.clickwomen();
	Assert.assertTrue(bp.getTitlte().contains("Women"));
	hp.clickDreses();
	Assert.assertTrue(bp.getTitlte().contains("Dresses"));
	hp.clickTshirt();
	Assert.assertTrue(bp.getTitlte().contains("T-shirts"));
}

	//public void verifyemailsubcription()
	//{
	//	String  emailid="AutoTest"+ randomvalue+"@gmail.com";
		//hp.setEmail(emailid);
		//hp.
	//}
}

