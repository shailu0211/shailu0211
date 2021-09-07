package com.app.pages;


	import java.util.ArrayList;
	import java.util.List;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.FindBys;
	import org.openqa.selenium.support.PageFactory;

	public class loginObject extends BasePage {

		@FindBy(id="username")
		private WebElement txtboxusername;

		@FindBy(id="password")
		private WebElement txtpassword;

		@FindBy(id="login")
		private WebElement btnlogin;

		@FindBy(id="username_show")
		private WebElement hellomessage;
		
		public loginObject() {
			PageFactory.initElements(driver, this);
		}

		public void login(String username,String userpass) {
			setText(txtboxusername,username);
			setText(txtpassword,userpass);
			btnlogin.click();
			
		}

		public void setUsername(String Username) {
			setText(txtboxusername,Username);
			}
		
		
		public void setPassword(String Password) 
		{
			setText(txtpassword,Password);
		}
		
	}
		
		
		
		