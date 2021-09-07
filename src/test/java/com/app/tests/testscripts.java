package com.app.tests;


	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.*;;

	public class testscripts {

		testscripts scripts;
		BasePage bp;

		public testscripts() {
			scripts= new testscripts() ;
			bp = new BasePage();
		}

		@Test
		public void verifyusername() {
//			Assert.assertTrue(scripts.getClass().));
		}

		@Test
		public void verifyPanels() {
			List<String> actualValue =scripts.verifyusername();
			ArrayList<String> expectedValues = new ArrayList<String>();
			expectedValues.addAll(Arrays.asList("username", "password", "login"));
			Assert.assertTrue(actualValue.containsAll(expectedValues));
		}

		@Test
		
		public void verifyBasePage() {
			Assert.assertTrue(bp.elementFound(bp.);
		}

		@Test
		public void verifyTitleHome() {
			Assert.assertTrue(bp.elementFound(homePage.getTitleHome()));
		}

		
}
