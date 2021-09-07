package com.app.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class dressespageobject extends BasePage
{						
	@FindBy(id="layered_id_attribute_group_1")
	private WebElement dressesclickcheckboxshort;
	@FindBy(xpath="//*[@id='center_column']/h1/span[2]")
	private WebElement textofproducts;
	@FindBys(@FindBy(xpath="//*[@id='center_column']/ul"))
	private List<WebElement> listofproducts;
	


	}
	public void 	clickCheckboxshort(){
		dressesclickcheckboxshort.click();
		
	}
	

		public Boolean verifythecheckboxshort()
		{		
		Boolean output=dressesclickcheckboxshort.isSelected();
	return output;
		}

		public int getproductcountfromtheheading()
		{
			String heading =textofproducts.getText();
	        String[] arr= heading.split("");
		     String value=arr[2];
		    int data=Integer.parseInt(value);
			return data;
			//return  Integer.parseInt(textofproducts.getText());
		}
		
		
		
		public int getimagesofproducts() {
			return listofproducts.size();
			
		}

}
		
		
		


